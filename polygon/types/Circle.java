package polygon.types;

import polygon.Geom2D;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circle implements Geom2D {
	
	public int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	@Override
	public void drawShape(Graphics g, int offsetX, int offsetY) {
		g.setColor(Color.RED);
		g.fillOval(offsetX, offsetY, radius, radius);
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
		return "This is a circle with radius of length: " + radius;
	}

}
