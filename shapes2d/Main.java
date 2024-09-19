package shapes2d;

import graphics.ShapeDrawerPanel;
import polygon.interfaces.Geom2D;
import polygon.types.Circle;
import polygon.types.Rectangle;
import polygon.types.RightTriangle;
import polygon.types.Square;

import javax.swing.JFrame;


public class Main {

	public static InstanceData instanceData = new InstanceData();
	public static void main(String[] args) {
		UserInterface.getUserInput();
	}
	public static JFrame fr = new JFrame();

	protected static void init() {
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);

		instanceData.newWorld();

		fr.add(instanceData.selectedWorld.drawer);
		fr.setVisible(true);
	}

	public static void resetFr() {

		fr.setVisible(true);
		fr.revalidate();
		fr.repaint();
	}
}
