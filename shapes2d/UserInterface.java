package shapes2d;

import polygon.interfaces.Geom2D;

import java.util.Scanner;

public class UserInterface {

    public void printHeader() {
        System.out.println("Welcome to the 2D shapes application.");
    }

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);

    }

    public Geom2D getShape(String shapeName) {
        switch (shapeName) {
            default:
                throw new IllegalArgumentException("Shape " + shapeName + " does not exist!!!");
        }
    }
}





