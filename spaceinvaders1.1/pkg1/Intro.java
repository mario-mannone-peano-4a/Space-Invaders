
package spaceinvaders1.pkg1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author Mariolino
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(50);
        }
        for (i = 0; i < 10; i += 1) {
            System.out.println("i: " + i);
            this.repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 800, 600);
        g.setColor(Color.red);
        g.setFont(new Font("Bold", Font.LAYOUT_NO_LIMIT_CONTEXT, 85 + i));
        g.drawString("Space Invaders", 100 + i, 80 + i);
        g.setFont(new Font("Bold", Font.LAYOUT_NO_START_CONTEXT, 30 + i));
        g.drawString("      by Mario Mannone", 220 + i, 170 + i);
        g.dispose();
        strategy.show();
    }
}
