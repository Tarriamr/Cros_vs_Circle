package controller;

import model.Board;
import model.Player;

public class Player2 implements Player {
    private static String nick = "Player 2";
    private static String playSymbol = "O";
    private static String[][] board = new String[Board.getSizeRow()][Board.getSizeColumn()];

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void setNick(String nick) {
        Player2.nick = nick;
    }

    @Override
    public String getPlaySymbol() {
        return playSymbol;
    }

    @Override
    public void setPlaySymbol(String playSymbol) {
        Player2.playSymbol = playSymbol;
    }

    @Override
    public String getChoiceField(int row, int column) {
        return board[row][column];
    }

    @Override
    public void setChoiceField(int row, int column) {
        Player2.board[row][column] = Player2.playSymbol;
    }

    @Override
    public String[][] getBoard() {
        return board;
    }
}
