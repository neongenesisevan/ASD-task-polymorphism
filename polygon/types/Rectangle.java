package polygon.types;

import polygon.interfaces.Geom2D;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Rectangle implements Geom2D {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return length * 2 + width * 2;
	}

	@Override
	public void drawShape(Graphics g, int offsetX, int offsetY) {
		g.setColor(Color.GREEN);
		g.fillRect(offsetX, offsetY, length, width);
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
		return "This is a rectangle with length: " + length + " and width: " + width;
	}
}
