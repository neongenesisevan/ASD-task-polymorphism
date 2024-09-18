package polygon;

import polygon.interfaces.Geom2D;

public class ShapeEntity {
    Geom2D shape;

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
}
