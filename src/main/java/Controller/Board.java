package Controller;

public class Board {
    private String choice;
    private int[] decode = new int[2];
    private String[][] board = new String[3][3];

    public Board(String choice) {
        this.choice = choice;
    }

    public String[][] getBoard() {
        return board;
    }

    public int[] getDecode() {
        Decode decoder = new Decode(this.choice);
        return decoder.getDecode();
    }
}
