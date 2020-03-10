package Controller;

public class Board {
    private static String choice;
    private static int sizeRow, sizeColumn;
    private static String[][] board = new String[sizeRow][sizeColumn];
    private int[] decode = new int[2];

    public static void setChoice(String choice) {
        Board.choice = choice;
    }

    public static void setSizeRow() {
        Board.sizeRow = Options.getSizeRow();
    }

    public static void setSizeColumn() {
        Board.sizeColumn = Options.getSizeBoard().get("sizeColumn");
    }

    public String[][] getBoard() {
        return board;
    }

    public int[] getDecode() {
        Decode decoder = new Decode(choice);
        return decoder.getDecode();
    }
}
