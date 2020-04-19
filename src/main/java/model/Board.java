package model;

import controller.Play;
import controller.optionsPack.PlayOptions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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

    public static void setSizeRow(String sizeRow) {
        sizeBoard.put("sizeRow", size(sizeRow));
    }

    public static int getSizeColumn() {
        Integer defaultValue = 3;
        return Board.sizeBoard.getOrDefault("sizeColumn", defaultValue);
    }

    public static void setSizeColumn(String sizeColumn) {
        sizeBoard.put("sizeColumn", size(sizeColumn));
    }

    public static String getBoardField(int row, int column) {
        return board[row][column];
    }

    public static void setBoard() {
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

    private static int size(String size) {
        Scanner scanner = new Scanner(System.in);
        int boardSize = 0;

        try {
            boardSize = Integer.parseInt(size);
        } catch (IllegalArgumentException bug) {
            System.out.print("    Incorrect data input.\n\n" +
                    "    Choose the Play option number:   ");
            new PlayOptions().menuPlayOptions(scanner.next());
            System.out.println();
        }

        if (boardSize >= 3 && boardSize <= 9) {
            return boardSize;
        } else {
            System.out.print("    Uncorrected board size.\n\n" +
                    "    Choose the Play option number:   ");
            new PlayOptions().menuPlayOptions(scanner.next());
            System.out.println();
            return 3;
        }
    }
}
