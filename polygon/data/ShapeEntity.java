package polygon.data;

import polygon.interfaces.Geom2D;

import java.awt.*;

public class ShapeEntity {

    protected Geom2D shape;
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
}
