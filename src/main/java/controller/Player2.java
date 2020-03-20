package controller;

import model.Board;
import model.HumanPlayer;

public class Player2 extends HumanPlayer {
    private static String playSymbol = "O";
    private static String[][] board = new String[Board.getSizeRow()][Board.getSizeColumn()];
}
