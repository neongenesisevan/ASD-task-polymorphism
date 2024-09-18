package shapes2d;

import polygon.ShapeEntity;
import polygon.interfaces.Geom2D;

import java.util.ArrayList;
import java.util.List;

public class InstanceData {
    public List<ShapeEntity> shapesList = new ArrayList<>();

    public void addShape(Geom2D shape) {
        shapesList.add(new ShapeEntity(shape));
    }
}
