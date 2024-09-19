package shapes2d;

import polygon.interfaces.Geom2D;
import polygon.types.Circle;
import polygon.types.Rectangle;
import polygon.types.RightTriangle;
import polygon.types.Square;

import javax.swing.JFrame;


public class Main {

	protected static InstanceData instanceData = new InstanceData();
	public static void main(String[] args) {
		UserInterface.getUserInput();
	}

	protected static void init() {
		JFrame fr = new JFrame();
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);

		instanceData.newWorld();

		for (int i = 0; i < 100; i++) {
			instanceData.selectedWorld.addShape(new Circle((int) (Math.random() * 50 + 50)), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
		}

		fr.add(instanceData.selectedWorld.drawer);
		fr.setVisible(true);

		JFrame fr2 = new JFrame();
		fr2.setBounds(50, 50, 450, 500);
		fr2.setDefaultCloseOperation(3);

		instanceData.newWorld();
		instanceData.selectWorld(1);

		for (int i = 0; i < 100; i++) {
			instanceData.selectedWorld.addShape(new Rectangle((int) (Math.random() * 50 + 50), (int) (Math.random() * 50 + 50)), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
		}

		fr2.add(instanceData.selectedWorld.drawer);
		fr2.setVisible(true);

		JFrame fr3 = new JFrame();
		fr3.setBounds(50, 50, 450, 500);
		fr3.setDefaultCloseOperation(3);

		instanceData.newWorld();
		instanceData.selectWorld(2);

		for (int i = 0; i < 100; i++) {
			instanceData.selectedWorld.addShape(new RightTriangle((int) (Math.random() * 50 + 50), (int) (Math.random() * 50 + 50)), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
		}

		fr3.add(instanceData.selectedWorld.drawer);
		fr3.setVisible(true);
	}
}
