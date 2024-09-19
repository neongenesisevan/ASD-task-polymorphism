package shapes2d;

import java.util.ArrayList;
import java.util.List;

public class InstanceData {
    private static List<World> worlds = new ArrayList<>();
    public World selectedWorld;

    public World newWorld() {
        World newWorld = new World();
        worlds.add(newWorld);
        if (selectedWorld == null) {
            selectedWorld = newWorld;
        }
        return newWorld;
    }

    public List<World> getWorlds() {
        return worlds;
    }

    public void selectWorld(int i) {
        selectedWorld = worlds.get(i);
    }
}
