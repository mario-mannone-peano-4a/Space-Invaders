package spaceinvadersmain;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author mannone.mario
 */
class Space extends Canvas {

    //Metodo costruttore che imposta lo sfondo e le dimensioni del canvas
    Space() {
        System.out.println("Setting canvas background and dimentions");
        setBackground(Color.BLACK);
        setSize(800, 600);
    }

 
}
