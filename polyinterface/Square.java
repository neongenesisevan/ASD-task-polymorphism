package polyinterface_new;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Square implements Geom2D {
	
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

	@Override
	public String toString() {
		return "This is a square with sides length: " + side;
	}

	@Override
	public void drawIllustration() {
		
		JFrame fr = new JFrame();
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);
		
		JPanel pn1 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.setColor(Color.BLUE);
				g.fillRect(100, 100, (int) side, (int) side);
			}
		};
		
		fr.add(pn1);
		fr.setVisible(true);	
	}
}
