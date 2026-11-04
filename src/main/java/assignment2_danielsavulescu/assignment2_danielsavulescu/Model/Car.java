package assignment2_danielsavulescu.assignment2_danielsavulescu.Model;

/**
 *
 * @author Daniel Savulescu
 */
public class Car {

    private final String type;
    private final int number;
    private final String colorName;
    private final String colorHex;
    private final int lane;

    private double x;
    private double y;
    private double speed; //pixels per second
    private double finishPlace; //0 means the car is still racing

    public Car(String type, int number, String colorName, String colorHex, int lane) {
        this.type = type;
        this.number = number;
        this.colorName = colorName;
        this.colorHex = colorHex;
        this.lane = lane;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public String getColorName() {
        return colorName;
    }

    public String getColorHex() {
        return colorHex;
    }

    public int getLane() {
        return lane;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFinishPlace() {
        return finishPlace;
    }

    /**
     * checks whether the car has finished its race yet or not
     *
     * @return true if it finished, false if it hasn't
     */
    public boolean isFinished() {
        return finishPlace > 0;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFinishPlace(double finishPlace) {
        this.finishPlace = finishPlace;
    }

    public void setPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * resets the state of the car
     *
     * @param startX the starting x of the car
     * @param startY the starting y of the car
     */
    public void resetCarState(double startX, double startY) {
        this.x = startX;
        this.y = startY;
        this.finishPlace = 0;
    }

    /**
     * gives the identification of a car
     *
     * @return the identification of a car
     */
    public String getLabel() {
        return "Car #" + number + " (" + colorName + ")";
    }
}
