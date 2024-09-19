package shapes2d.menus;

import shapes2d.InstanceData;
import shapes2d.Main;
import shapes2d.World;

public class WorldSelectionMenu implements Menu {

    @Override
    public Menu processInput(int input) {
        if (!(input + 1 > Main.instanceData.getWorlds().size())) {
            Main.instanceData.selectWorld(input);
        }
        return Menus.mainMenu;
    }

    @Override
    public void printMenuHeader() {

        System.out.println("World Selection \n");

        for (int i = 0; i < Main.instanceData.getWorlds().size(); i++)
            System.out.println("(" + i + ")" + Main.instanceData.getWorlds().get(i));
    }
}
