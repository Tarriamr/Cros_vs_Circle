package Controller;

public class Board {
    private static String choice;
    private static int sizeX, sizeY;
    private static String[][] board = new String[sizeX][sizeY];
    private int[] decode = new int[2];

    public static void setChoice(String choice) {
        Board.choice = choice;
    }

    public static void setSizeX() {
        Board.sizeX = Options.getSizeX();
    }

    public static void setSizeY() {
        Board.sizeY = Options.getSizeX();
    }

    public String[][] getBoard() {
        return board;
    }

    public int[] getDecode() {
        Decode decoder = new Decode(choice);
        return decoder.getDecode();
    }
}
