package model;

import controller.Player1;
import controller.Player2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Board {

    private static Map<String, Integer> sizeBoard = new LinkedHashMap<>();
    private static String[][] board = new String[getSizeRow()][getSizeColumn()];
    private static int counter = getSizeRow() * getSizeColumn();

    private Board(int sizeRow, int sizeColumn) {
        sizeBoard.put("sizeRow", sizeRow);
        sizeBoard.put("sizeColumn", sizeColumn);
    }

    public Board() {
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Board.counter = counter;
    }

    public static int getSizeRow() {
        Integer defaultValue = 3;
        return Board.sizeBoard.getOrDefault("sizeRow", defaultValue);
    }

    public static void setSizeRow(int sizeRow) {
        sizeBoard.put("sizeRow", sizeRow);
    }

    public static int getSizeColumn() {
        Integer defaultValue = 3;
        return Board.sizeBoard.getOrDefault("sizeColumn", defaultValue);
    }

    public static void setSizeColumn(int sizeColumn) {
        sizeBoard.put("sizeColumn", sizeColumn);
    }

    public static String getBoardField(int row, int column) {
        Board.setBoard();
        return board[row][column];
    }

    private static void setBoard() {
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        for (int i = 0; i < getSizeRow(); i++) {
            for (int j = 0; j < getSizeColumn(); j++) {
                if (player1.getBoard()[i][j] == null) {
                    board[i][j] = player2.getBoard()[i][j];
                } else {
                    board[i][j] = player1.getBoard()[i][j];
                }
            }
        }
    }
}
