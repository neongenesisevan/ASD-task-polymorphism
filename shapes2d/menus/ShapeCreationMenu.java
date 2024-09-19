package shapes2d.menus;

import polygon.types.*;
import shapes2d.Main;

import java.util.Scanner;

public class ShapeCreationMenu implements Menu {

    private int returnInt = 6;

    @Override
    public Menu processInput(int input) {

        if (input == returnInt) {
            return Menus.mainMenu;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the shape parameters.");
        System.out.println("x: ");
        int x = sc.nextInt();
        System.out.println("y: ");
        int y = sc.nextInt();


        switch (input) {
            case 0:
                System.out.println("radius: ");
                int radius = sc.nextInt();
                Main.instanceData.selectedWorld.addShape(
                        new Circle(radius), x, y
                );
                return this;
            case 1:
                System.out.println("length: ");
                int length = sc.nextInt();
                System.out.println("width: ");
                int width = sc.nextInt();
                Main.instanceData.selectedWorld.addShape(
                        new Rectangle(length, width), x, y
                );
                return this;
            case 2:
                System.out.println("base: ");
                int base = sc.nextInt();
                System.out.println("height: ");
                int height = sc.nextInt();
                Main.instanceData.selectedWorld.addShape(
                        new RightTriangle(base, height), x, y
                );
                return this;
            case 3:
                System.out.println("side length: ");
                int sideLength = sc.nextInt();
                Main.instanceData.selectedWorld.addShape(
                        new Square(sideLength), x, y
                );
                return this;
            case 4:
                System.out.println("topLength: ");
                int topLength = sc.nextInt();
                System.out.println("bottomLength: ");
                int bottomLength = sc.nextInt();
                System.out.println("height: ");
                int height_ = sc.nextInt();

                Main.instanceData.selectedWorld.addShape(
                        new RightTrapezium(topLength, bottomLength, height_), x, y
                );
                return this;
            case 5:
                System.out.println("base: ");
                int base_ = sc.nextInt();
                System.out.println("height: ");
                int height__ = sc.nextInt();
                System.out.println("side length: ");
                int sideLength_ = sc.nextInt();

                Main.instanceData.selectedWorld.addShape(
                        new Parallelogram(base_, height__, sideLength_), x, y
                );
                return this;
            default:
                return this;
        }
    }

    @Override
    public void printMenuHeader() {

        System.out.println("Shape Creation \n");

        System.out.println(
                "(0): Circle \n" +
                "(1): Rectangle \n" +
                "(2): RightTriangle \n" +
                "(3): Square \n" +
                "(4): Right Trapezium \n" +
                        "(5): Parallelogram \n" +
                "(" + returnInt +"): Back \n"
        );
    }
}
