package shapes2d.menus;

import polygon.types.Circle;
import polygon.types.Rectangle;
import polygon.types.RightTriangle;
import polygon.types.Square;
import shapes2d.Main;

import java.util.Scanner;

public class ShapeCreationMenu implements Menu {

    @Override
    public Menu processInput(int input) {

        if (input == 4) {
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
                "(4): Back \n"
        );
    }
}
