package assignment2_danielsavulescu.assignment2_danielsavulescu.View;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

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
    }
}
