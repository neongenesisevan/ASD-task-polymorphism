package shapes2d;

import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static InstanceData instanceData = new InstanceData();
	public static void main(String[] args) {
		UserInterface.getUserInput();
	}
	public static List<JFrame> frames = new ArrayList<>();

	protected static void init() {

		World world = instanceData.newWorld();
		JFrame fr = new JFrame();

		frames.add(fr);

		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);

		fr.add(world.drawer);
		fr.setVisible(true);
	}

	public static JFrame newFrame() {
		JFrame fr = new JFrame();
		frames.add(fr);
		fr.setBounds(50, 50, 450, 500);
		fr.setDefaultCloseOperation(3);
		fr.setVisible(true);
		return fr;
	}
}
