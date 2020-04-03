package spaceinvaders1.pkg1;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author Mariolino
 */
public class Space extends Canvas {

    Space() {
        System.out.println("Setting canvas background and dimentions");
        setBackground(Color.BLACK);
        setSize(800, 600);
    }
}
