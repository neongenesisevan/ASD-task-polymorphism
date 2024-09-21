package graphics;

import polygon.ShapeEntity;
import shapes2d.World;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawerPanel extends JPanel {

    public World world;

    public ShapeDrawerPanel(World world) {
        this.world = world;
    }

    @Override
    public void paint(Graphics g) {
        for (ShapeEntity shapeEntity : world.shapesList) {
            shapeEntity.draw(g);
        }
    }
}





