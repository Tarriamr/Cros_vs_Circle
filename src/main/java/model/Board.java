package model;

import controller.Play;

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

        for (int i = 0; i < getSizeRow(); i++) {
            for (int j = 0; j < getSizeColumn(); j++) {
                if (Play.getPlayer1().getBoard()[i][j] == null) {
                    board[i][j] = Play.getPlayer2().getBoard()[i][j];
                } else {
                    board[i][j] = Play.getPlayer1().getBoard()[i][j];
                }
            }
        }
    }
}
