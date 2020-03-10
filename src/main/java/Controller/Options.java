package Controller;

public class Options {
    private static int sizeX = 3, sizeY = 3;

    public Options(int sizeX, int sizeY) {
        Options.sizeX = sizeX;
        Options.sizeY = sizeY;
    }

    public static int getSizeX() {
        return sizeX;
    }

    public static int getSizeY() {
        return sizeY;
    }
}
