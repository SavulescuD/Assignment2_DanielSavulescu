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
    

}

