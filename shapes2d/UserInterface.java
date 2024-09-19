package shapes2d;

import polygon.Geom2D;
import shapes2d.menus.MainMenu;
import shapes2d.menus.Menu;

import java.util.Scanner;

public class UserInterface {

    private static Menu currentMenu;

    private static void printHeader() {
        System.out.println("Welcome to the 2D shapes application.");
        System.out.println("Enter anything to create a session.");
    }

    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        printHeader();
        sc.nextLine();
        currentMenu = new MainMenu();
        Main.init();

        while (true) {

            currentMenu.printMenuHeader();
            if (!processUserInput(sc.nextLine())) {
                break;
            }
            Main.instanceData.selectedWorld.drawer.revalidate();
            Main.instanceData.selectedWorld.drawer.repaint();
        }
        System.out.println("Thank you for using our amazing software");
        System.exit(0);
    }

    private static boolean processUserInput(String line) {
        try {
            int input = Integer.parseInt(line);

            currentMenu = currentMenu.processInput(input);
            if (currentMenu == null) {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Please enter a valid input");
            return true;
        }
        return true;
    }

    private static Geom2D getShape(String shapeName) {
        switch (shapeName) {
            default:
                throw new IllegalArgumentException("Shape " + shapeName + " does not exist!!!");
        }
    }
}





