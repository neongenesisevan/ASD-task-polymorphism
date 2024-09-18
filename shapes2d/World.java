package shapes2d;

import graphics.ShapeDrawerPanel;
import polygon.data.ShapeEntity;
import polygon.interfaces.Geom2D;

import java.util.ArrayList;
import java.util.List;

public class InstanceData {
    public List<ShapeEntity> shapesList = new ArrayList<>();
    public ShapeDrawerPanel drawer = new ShapeDrawerPanel(this);

    public void addShape(Geom2D shape, int positionX, int positionY) {
        shapesList.add(new ShapeEntity(shape, positionX, positionY));
    }

    public void addShape(Geom2D shape) {
        addShape(shape, 0, 0);
    }
}
