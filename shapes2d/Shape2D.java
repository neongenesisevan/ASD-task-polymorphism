package shapes2d;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Shape2D {

	public static void main(String[] args) {
		JFrame fr = new JFrame();
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);
		
		JPanel pn1 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				g.setColor(Color.RED);
				// g.fillRect(100, 100, 250, 250);
				g.fillOval(100, 100, 250, 250);

				Graphics2D g2 = (Graphics2D)g.create();
				g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
				g2.setColor(Color.RED);
				g2.fill(new Polygon(new int[]{220, 60, 380}, 
						new int[]{80, 380, 380}, 3));

			}
		};
		
		fr.add(pn1);
		fr.setVisible(true);

	}

}
