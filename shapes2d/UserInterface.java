package shapes2d;

import polygon.interfaces.Geom2D;

import java.util.Scanner;

public class UserInterface {

    private static void printHeader() {
        System.out.println("Welcome to the 2D shapes application.");
    }

    public static void getUserInput() {
        Scanner sc = new Scanner(System.in);
        printHeader();

        while (true) {
            // do shit

            if (true) {
                break;
            }
        }
        Main.init();
        System.out.println("Thank you for using our amazing software");
    }

    private static Geom2D getShape(String shapeName) {
        switch (shapeName) {
            default:
                throw new IllegalArgumentException("Shape " + shapeName + " does not exist!!!");
        }
    }
}





