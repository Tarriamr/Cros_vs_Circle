package Model;

import Controller.Options;

public class BoardField {
    private String choice;  // todo - connect with Board.getDecode() or Board.getBoard()
    private int sizeRow = Options.getSizeRow() * 2 + 3;
    private int sizeColumn = Options.getSizeColumn() * 2 + 3;

    private String[][] field = new String[sizeRow][sizeColumn];

    public BoardField(String choice) {
        this.choice = choice;
    }

    private String[][] boardField() {
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColumn; j++) {
                if ((i + 1) % 2 == 0 && (j + 1) % 2 == 0) {
                    if (i == 1 && j == 1) {
                        field[i][j] = " * ";
                    } else if (i == 1) {
                        field[i][j] = " " + (1 + (j - 3) / 2) + " ";
                    } else if (j == 1) {
                        field[i][j] = " " + Character.toString(65 + (i - 3) / 2) + " ";
                    } else {
                        field[i][j] = " " + choice + " ";
                    }
                } else {
                    if (i % 2 == 0 && j % 2 == 0) {
                        field[i][j] = " + ";
                    } else if (i % 2 == 0) {
                        field[i][j] = " - ";
                    } else {
                        field[i][j] = " | ";
                    }
                }
            }
        }
        return field;
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
