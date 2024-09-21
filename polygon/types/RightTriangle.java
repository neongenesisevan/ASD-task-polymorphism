package polygon.types;

import polygon.Geom2D;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RightTriangle implements Geom2D {

	private int base;
	private int height;

	public RightTriangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {

		return 0.5 * base * height;
	}

	@Override
	public double getPerimeter() {
		double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
		return base + height + hypotenuse;
	}

	@Override
	public void drawShape(Graphics g, int offsetX, int offsetY) {
		int[] xPoints = { offsetX, offsetX + base, offsetX };
		int[] yPoints = { offsetY, offsetY, offsetY + height };
		g.setColor(Color.yellow);
		g.fillPolygon(xPoints, yPoints, 3);
	}

	@Override
	public void drawIllustration() {
		
		JFrame fr = new JFrame();
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);
		
		JPanel pn1 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				drawShape(g, 50, 50);
			}
		};
		
		fr.add(pn1);
		fr.setVisible(true);	
	}

	@Override
	public String toString() {
		return "This is a right triangle with base: " + base + " and height: " + height;
	}
}
