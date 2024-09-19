package polygon;

import java.awt.*;

public class ShapeEntity {

    public Geom2D shape;
    public int positionX = 0;
    public int positionY = 0;

    public ShapeEntity(Geom2D shape) {
        this.shape = shape;
    }

    public ShapeEntity(Geom2D shape, int positionX, int positionY) {
        this.shape = shape;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void draw(Graphics g) {
        shape.drawShape(g, positionX, positionY);
    }

    public void printPosition() {
        System.out.println("(" + positionX + ", " + positionY + ")");
    }
}
