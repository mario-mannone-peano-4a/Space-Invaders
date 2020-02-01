package spaceinvadersmain;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Intro extends Space {

    private int i = 0;

    void run() throws InterruptedException {
        setBackground(Color.BLACK);
        setSize(800, 600);
        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(50);
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.setFont(new Font("Bold", Font.LAYOUT_NO_LIMIT_CONTEXT,  100+i));
        g.drawString("Space Invaders", 100 + i, 90 + i);
        g.setFont(new Font("Bold", Font.LAYOUT_NO_START_CONTEXT, 30 + i));
        g.drawString("      by Mario Mannone", 220 + i, 170 + i);
    }

}
