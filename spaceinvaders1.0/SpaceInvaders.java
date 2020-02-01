package spaceinvadersmain;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author mannone.mario
 */
public class SpaceInvaders extends JFrame {
//Spazio immenso(sfondo nero)

    private Space space = new Space();

    public SpaceInvaders() throws InterruptedException {
        super("Space Invaders 101");//Titolo della finestra di gioco
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Comando x chiudere la finestra
        //Aggiungo lo spazio profondo alla finestra di gioco
        this.setResizable(false);
        //Avvia l'introduzione
        Intro intro = new Intro();
        this.add(intro);
        //Impacchettamento e gioco visibile
        this.pack();
        this.setVisible(true);
        intro.run();
        this.add(space);
    }

}
