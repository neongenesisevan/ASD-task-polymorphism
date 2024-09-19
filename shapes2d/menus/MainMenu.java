package shapes2d.menus;

import shapes2d.Main;

public class MainMenu implements Menu {

    @Override
    public Menu processInput(int input) {
        switch (input) {
            case 0:
                return null;
            case 1:
                return Menus.shapeCreationMenu;
            case 2:
                return Menus.shapeSelectionMenu; //todo
            case 3:
                System.out.println("World successfully created!");
                Main.instanceData.newWorld();
                return this;
            case 4:
                return Menus.worldSelectionMenu;
            default:
                return this;
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("Main Menu \n");

        System.out.println(
                "(0): Exit \n" +
                "(1): Create a new shape \n" +
                "(2): Select a shape \n" +
                "(3): Create a new world \n" +
                "(4): Select a world \n"
        );
    }
}
