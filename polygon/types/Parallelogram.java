package polygon.types;

import polygon.Geom2D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parallelogram implements Geom2D {

    private int base;
    private int height;
    private int sideLength;

    public Parallelogram(int base, int height, int sideLength) {
        this.base = base;
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + sideLength);
    }

    @Override
    public void drawShape(Graphics g, int offsetX, int offsetY) {
        g.setColor(Color.ORANGE);

        // Coordinates of the four vertices of the parallelogram
        int[] xPoints = {offsetX, offsetX + base, offsetX + base + sideLength, offsetX + sideLength};
        int[] yPoints = {offsetY, offsetY, offsetY + height, offsetY + height};

        g.fillPolygon(xPoints, yPoints, 4);
    }

    @Override
    public void drawIllustration() {
        JFrame fr = new JFrame();
        fr.setBounds(50, 50, 450, 500);
        fr.setDefaultCloseOperation(3);

        JPanel pn1 = new JPanel() {
            @Override
            public void paint(Graphics g) {
                drawShape(g, 0, 0);
            }
        };

        fr.add(pn1);
        fr.setVisible(true);
    }

    @Override
    public String toString() {
        return "This is a parallelogram with base: " + base + ", height: " + height + ", and side length: " + sideLength;
    }
}