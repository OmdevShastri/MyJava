package MyGameInJava;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class NewtonianPhysicsGame extends JFrame {//ChatGPT
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    private int x = WIDTH / 2;
    private int y = HEIGHT / 2;
    private int vx = 5;
    private int vy = 5;
    private int ax = 0;
    private int ay = 1;

    public NewtonianPhysicsGame() {
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.clearRect(0, 0, WIDTH, HEIGHT);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(Color.BLACK);
        g2d.fill(new Ellipse2D.Double(x, y, 50, 50));

        x += vx;
        y += vy;
        vx += ax;
        vy += ay;

        if (y + 50 >= HEIGHT) {
            y = HEIGHT - 50;
            vy = -vy;
        }

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        repaint();
    }

    public static void main(String[] args) {
        new NewtonianPhysicsGame();
    }
}
