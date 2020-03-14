package Controller;

public class Player1 implements Player {
    private static String[][] board = new Board().getBoard();
    private static String nick = "Player 1";
    private static String playSymbol = "X";

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void setNick(String nick) {
        Player1.nick = nick;
    }

    @Override
    public String getPlaySymbol() {
        return playSymbol;
    }

    @Override
    public void setPlaySymbol(String playSymbol) {
        Player1.playSymbol = playSymbol;
    }

    @Override
    public String getChoiceField(int row, int column) {
        return board[row][column];
    }

    @Override
    public void setChoiceField(int row, int column) {
        Player1.board[row][column] = Player1.playSymbol;
    }
}
