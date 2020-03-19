package view.consol;

import model.Board;

public class BoardField {
    private int sizeRow = Board.getSizeRow() * 2 + 3;
    private int sizeColumn = Board.getSizeColumn() * 2 + 3;

    private String[][] board = new String[sizeRow][sizeColumn];

    private String setField(int row, int column) {
        String field = Board.getBoardField(row, column);
        if (field == null) field = " ";
        return field;
    }

    private String[][] boardField() {
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
                    if (i == 1 && j == 1) {
                        board[i][j] = " * ";
                    } else if (i == 1) {
                        board[i][j] = " " + (1 + (j - 3) / 2) + " ";
                    } else if (j == 1) {
                        board[i][j] = " " + Character.toString(65 + (i - 3) / 2) + " ";
                    } else {
                        board[i][j] = " " + setField((i - 3) / 2, (j - 3) / 2) + " ";
                    }
                } else {
                    if (i % 2 == 0 && j % 2 == 0) {
                        board[i][j] = " + ";
                    } else if (i % 2 == 0) {
                        board[i][j] = " - ";
                    } else {
                        board[i][j] = " | ";
                    }
                }
            }
        }
        return board;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                result.append(boardField()[i][j]);
            }
            if (i < sizeRow - 1)
                result.append("\n");
        }
        return result.toString();
    }
}
