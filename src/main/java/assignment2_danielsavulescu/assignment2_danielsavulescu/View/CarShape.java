package assignment2_danielsavulescu.assignment2_danielsavulescu.View;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 *
 * @author Daniel Savulescu
 */
public class CarShape extends Group {
    private final List<Node> wheels = new ArrayList<>();
    
    public CarShape(String colorHex, int number) {
        Color bodyColor = Color.web(colorHex);
        
        //Body and roof
        Polygon body = new Polygon(0, 16, 90, 16, 100, 24, 100, 34, 0, 34);
        body.setFill(bodyColor);
        Polygon roof = new Polygon(22, 16, 32, 2, 66, 2, 80, 16);
        roof.setFill(bodyColor);
        
        //Windows
        Rectangle window1 = new Rectangle(34, 5, 13, 9);
        Rectangle window2 = new Rectangle(51, 5, 13, 9);
        window1.setFill(Color.LIGHTSKYBLUE);
        window2.setFill(Color.LIGHTSKYBLUE);
        
        //Lights
        Rectangle headLight = new Rectangle(94, 22, 6, 5);
        headLight.setFill(Color.LIGHTGOLDENRODYELLOW);
        Rectangle tailLight = new Rectangle(0, 22, 4, 5);
        tailLight.setFill(Color.ORANGERED);
        
        //Car number plate
        Rectangle plate = new Rectangle(38, 19, 24, 12);
        plate.setFill(Color.WHITE);
        plate.setArcHeight(3);
        plate.setArcWidth(3);
        Text numberText = new Text(String.valueOf(number));
        numberText.setFont(Font.font("Arial", FontWeight.BOLD, 11));
        numberText.setX(50 - numberText.getLayoutBounds().getWidth() / 2);
        numberText.setY(29);
        
        getChildren().addAll(body, roof, window1, window2, headLight, tailLight, plate, numberText);
        
        //Wheels
    }
    
    /**
     * creates a wheel with a tire and a line from its center to the edge
     * @param centerX the centerX of the wheel
     * @param centerY the centerY of the wheel
     * @return the wheel
     */
    private Node createWheel(double centerX, double centerY) {
        Circle tire = new Circle(centerX, centerY, 6, Color.LIGHTGRAY);
        tire.setStroke(Color.web("#1c1c1c"));
        tire.setStrokeWidth(3);
        Line spoke = new Line(centerX, centerY, centerX, centerY - 6);
        spoke.setStroke(Color.DARKSLATEGRAY);
        spoke.setStrokeWidth(1.8);
        return new Group(tire, spoke);
    }
}
