package controller;

import model.Board;
import model.HumanPlayer;

public class Player1 extends HumanPlayer {
    private static String playSymbol = "X";
    private static String[][] board = new String[Board.getSizeRow()][Board.getSizeColumn()];
}
