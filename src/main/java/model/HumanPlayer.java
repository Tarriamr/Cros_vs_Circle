package model;

public class HumanPlayer implements Player {
    private String nick = "";
    private String playSymbol = "";
    private String[][] board = new String[Board.getSizeRow()][Board.getSizeColumn()];

    public HumanPlayer(String nick, String playSymbol) {
        this.nick = nick;
        this.playSymbol = playSymbol;
    }

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String getPlaySymbol() {
        return playSymbol;
    }

    @Override
    public void setPlaySymbol(String playSymbol) {
        this.playSymbol = playSymbol;
    }

    @Override
    public String getChoiceField(int row, int column) {
        return board[row][column];
    }

    @Override
    public void setChoiceField(int row, int column) {
        board[row][column] = playSymbol;
    }

    @Override
    public String[][] getBoard() {
        return board;
    }

}
