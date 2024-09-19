package polygon.types;

import polygon.Geom2D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RightTrapezium implements Geom2D {

    private int topLength;
    private int bottomLength;
    private int height;

    public RightTrapezium(int topLength, int bottomLength, int height) {
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (topLength + bottomLength) * height;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow((bottomLength - topLength), 2) + Math.pow(height, 2));
        return topLength + bottomLength + height + side;
    }

    @Override
    public void drawShape(Graphics g, int offsetX, int offsetY) {
        g.setColor(Color.BLUE);
        int[] xPoints = {offsetX, offsetX + topLength, offsetX + bottomLength, offsetX};
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
        return "This is a right trapezium with top length: " + topLength + ", bottom length: " + bottomLength + ", and height: " + height;
    }
}