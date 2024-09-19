package shapes2d;

import java.util.ArrayList;
import java.util.List;

public class InstanceData {
    private static List<World> worlds = new ArrayList<>();
    public World selectedWorld;

    public void newWorld() {
        World newWorld = new World();
        worlds.add(newWorld);
        if (selectedWorld == null) {
            selectedWorld = newWorld;
        }
    }

    public void selectWorld(int i) {
        selectedWorld = worlds.get(i);
    }
}
