package shapes2d.menus;

public interface Menu {
    abstract Menu processInput(int input);
    abstract void printMenuHeader();
}
