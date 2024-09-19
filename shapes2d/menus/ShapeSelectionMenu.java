package shapes2d.menus;

import polygon.ShapeEntity;
import shapes2d.Main;

import java.util.List;

public class ShapeSelectionMenu implements Menu {

    @Override
    public Menu processInput(int input) {
        int size = Main.instanceData.selectedWorld.shapesList.size();
        if (!(input + 1 > size)) {
            Menus.shapeIdentificationMenu.selectedShapeEntity = Main.instanceData.selectedWorld.shapesList.get(input);
        } else if (input == size) {
            return Menus.mainMenu;
        }
        return Menus.shapeIdentificationMenu;
    }

    @Override
    public void printMenuHeader() {

        System.out.println("Shape Selection \n");

        List<ShapeEntity> shapes = Main.instanceData.selectedWorld.shapesList;
        int size = shapes.size();
        for (int i = 0; i < size ; i++) {
            System.out.println("(" + i + ") " + shapes.get(i).shape  + i);
        }
        System.out.println("(" + size + ")" + " Back");
    }
}
