package shapes2d;

import polygon.interfaces.Geom2D;
import polygon.types.Square;

import javax.swing.JFrame;


public class Main {

	protected static InstanceData instanceData = new InstanceData();
	public static void main(String[] args) {
		init();
	}

	private static void init() {
		JFrame fr = new JFrame();
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);

		instanceData.newWorld();

		for (int i = 0; i < 100; i++) {
			instanceData.selectedWorld.addShape(new Square((int) (Math.random() * 50 + 50)), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
		}

		fr.add(instanceData.selectedWorld.drawer);
		fr.setVisible(true);

		instanceData.newWorld();

		instanceData.selectWorld(1);

		for (int i = 0; i < 100; i++) {
			instanceData.selectedWorld.addShape(new Square((int) (Math.random() * 50 + 50)), (int) (Math.random() * 1000), (int) (Math.random() * 1000));
		}

		fr.add(instanceData.selectedWorld.drawer);
		fr.setVisible(true);
	}
}
