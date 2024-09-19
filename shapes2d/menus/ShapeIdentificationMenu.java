package shapes2d.menus;

import polygon.data.ShapeEntity;
import polygon.interfaces.Geom2D;

public class ShapeIdentificationMenu implements Menu {

    protected ShapeEntity selectedShapeEntity;

    @Override
    public Menu processInput(int input) {

        if (selectedShapeEntity == null) {
            return Menus.shapeSelectionMenu;
        }

        Geom2D shape = selectedShapeEntity.shape;

        switch (input) {
            case 0:
                return Menus.shapeSelectionMenu;
            case 1:
                System.out.println("Area: " + shape.getArea());
                return this;
            case 2:
                System.out.println("Perimeter: " + shape.getPerimeter());
                return this;
            case 3:
                selectedShapeEntity.printPosition();
                return this;
            case 4:
                shape.drawIllustration();
                return this;
            default:
                return this;
        }
    }

    @Override
    public void printMenuHeader() {

        System.out.println("Shape Identification \n");


        System.out.println(
                "(0) Back \n" +
                        "(1) Get Area \n" +
                        "(2) Get Perimeter \n" +
                        "(3) Get Position \n" +
                        "(4) Get Illustration \n"
        );
    }
}
