package assignment2_danielsavulescu.assignment2_danielsavulescu.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Daniel Savulescu
 */
public class CarRaceModel {
    public static final double TRACK_WIDTH = 900.0;
    public static final double STRIP_WIDTH = 50.0;
    public static final double LANE_HEIGHT = 70.0;
    public static final double CAR_WIDTH = 100.0;
    public static final double CAR_TOP_OFFSET = 14.0;
    public static final double START_X = STRIP_WIDTH + 10;
    public static final double FINISH_X = TRACK_WIDTH - STRIP_WIDTH;
    
    private static final double MIN_SECONDS = 6.0;
    private static final double MAX_SECONDS = 10.0;
    
    private final List<Car> cars = new ArrayList<>();
    private final List<Car> finishOrder = new ArrayList<>();
    private final Random random = new Random();
    
    public CarRaceModel() {
        cars.add(new Car("Muscle", 23, "Blue", "1e6fe8", 0));
        cars.add(new Car("Sports", 45, "Red", "e53935", 1));
        cars.add(new Car("Sedan", 78, "Green", "2e9e44", 2));
        cars.add(new Car("Roadster", 88, "Yellow", "f5b800", 3));
        reset();
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFinishOrder() {
        return finishOrder;
    }
    
    /**
     * calculates the track distance of the race
     * @return the track distance of the race
     */
    public double getTrackDistance() {
        return FINISH_X - START_X - CAR_WIDTH;
    }
    
    /**
     * resets the states of each car
     */
    public void reset() {
        finishOrder.clear();
        for (Car car : cars) {
            car.resetCarState(START_X, car.getLane() * LANE_HEIGHT + CAR_TOP_OFFSET);
        }
        randomizeSpeeds();
    }
    
    /**
     * randomizes the speeds of each car
     */
    public void randomizeSpeeds() {
        for (Car car : cars) {
            double seconds = MIN_SECONDS + random.nextDouble() * (MAX_SECONDS - MIN_SECONDS);
            car.setSpeed(getTrackDistance() / seconds);
        }
    }
    
    /**
     * updates the position of the car
     * @param car the car
     * @param x the x position of the car
     */
    public void updateCarX(Car car, double x) {
        car.setPosition(x, car.getY());
    }
    
    /**
     * registers the order of the car when finished
     * @param car the car
     * @return the finish place of the car
     */
    public int registerFinish(Car car) {
        if (!car.isFinished()) {
            finishOrder.add(car);
            car.setFinishPlace(finishOrder.size());
        }
        
        return car.getFinishPlace();
    }
    
    /**
     * determines whether the race is over
     * @return true if it is over, false if it is ongoing
     */
    public boolean isRaceOver() {
        return finishOrder.size() == cars.size();
    }
}
