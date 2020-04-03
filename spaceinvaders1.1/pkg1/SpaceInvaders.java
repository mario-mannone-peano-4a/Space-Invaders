package spaceinvaders1.pkg1;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Mariolino
 */
public class SpaceInvaders extends JFrame {

    private Space space = new Space();

    public SpaceInvaders() throws InterruptedException {
        super("Space Invaders 101");//Titolo della finestra di gioco
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Comando x chiudere la finestra
        //Aggiungo lo spazio profondo alla finestra di gioco
        this.setResizable(false);
        //Avvia l'introduzione
        this.setIgnoreRepaint(true);
        Intro intro = new Intro();
        this.add(intro);
        //Impacchettamento e gioco visibile
        this.pack();
        this.setVisible(true);
        intro.run();
    }
}
