package shapes2d;

import graphics.ShapeDrawerPanel;
import polygon.ShapeEntity;
import polygon.Geom2D;

import java.util.ArrayList;
import java.util.List;

public class World {
    public List<ShapeEntity> shapesList = new ArrayList<>();
    public ShapeDrawerPanel drawer = new ShapeDrawerPanel(this);
    public String name;

    public World () {
        this.name = "world_id_" + String.valueOf(Math.floor(Math.random() * 100000));
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void addShape(Geom2D shape, int positionX, int positionY) {
        shapesList.add(new ShapeEntity(shape, positionX, positionY));
    }

    public void addShape(Geom2D shape) {
        addShape(shape, 0, 0);
    }
}
