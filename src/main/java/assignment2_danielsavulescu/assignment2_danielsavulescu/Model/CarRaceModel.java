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
}
