package controller.playPack;

import controller.optionsPack.PlayOptions;
import model.Board;
import model.Player;

import java.util.Scanner;

public class Win {
    private static int lineSize = 3;
    private Player player;
    private int[] choiceField;
    private int rowSize;
    private int columnSize;

    public static int getLineSize() {
        return lineSize;
    }

    public static void setLineSize(String lineSize) {
        Win.lineSize = size(lineSize);
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

        int rowColumn = 3;
        rowColumn = Math.max(Board.getSizeRow(), Board.getSizeColumn());

        if (boardSize >= 3 && boardSize <= rowColumn) {
            return boardSize;
        } else {
            System.out.print("    Line length error.\n\n" +
                    "    Choose the Play option number:   ");
            new PlayOptions().menuPlayOptions(scanner.next());
            System.out.println();
            return 3;
        }
    }

    public boolean getWin(Player player, int[] choiceField, int rowSize, int columnSize) {
        this.player = player;
        this.choiceField = choiceField;
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        return winNS() || winEW() || winNWSE() || winNESW();
    }

    private boolean winNS() {
        int sum = 0;
        boolean winner = false;
        for (int i = 0; i < lineSize; i++) {
            if (((choiceField[0] - (lineSize - 1)) + i >= 0)
                    && ((choiceField[0] + i) <= (rowSize - 1))) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField(((lineSize - 1) - choiceField[0] - i + j), choiceField[1]) != null) {
                        sum += 1;
                    }
                    if (sum == lineSize) winner = true;
                }
            }
        }
        return winner;
    }

    private boolean winEW() {
        int sum = 0;
        boolean winner = false;
        for (int i = 0; i < lineSize; i++) {
            if (((choiceField[1] - (lineSize - 1)) + i >= 0)
                    && ((choiceField[1] + i) <= (columnSize - 1))) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField(choiceField[0], ((lineSize - 1) - choiceField[1] - i + j)) != null) {
                        sum += 1;
                    }
                    if (sum == lineSize) winner = true;
                }
            }
        }
        return winner;
    }

    private boolean winNWSE() {
        int sum = 0;
        boolean winner = false;
        for (int i = 0; i < lineSize; i++) {
            if (
                    ((choiceField[0] - (lineSize - 1)) + i >= 0)
                            && ((choiceField[1] - (lineSize - 1)) + i >= 0)
                            && ((choiceField[0] + i) <= (rowSize - 1))
                            && ((choiceField[1] + i) <= (columnSize - 1))
            ) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField(((lineSize - 1) - choiceField[0] - i + j),
                            ((lineSize - 1) - choiceField[1] - i + j)) != null) {
                        sum += 1;
                    }
                    if (sum == lineSize) winner = true;
                }
            }
        }
        return winner;
    }

    private boolean winNESW() {
        int sum = 0;
        boolean winner = false;
        for (int i = 0; i < lineSize; i++) {
            if (
                    ((choiceField[0] - (lineSize - 1)) + i >= 0)
                            && ((choiceField[1] + (lineSize - 1) - i) <= (columnSize - 1))
                            && (choiceField[0] + i <= (rowSize - 1))
                            && ((choiceField[1] - i) >= 0)
            ) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField((lineSize - 1) - choiceField[0] - i + j,
                            ((lineSize - 1) + choiceField[1] - i - j)) != null) {
                        sum += 1;
                    }
                    if (sum == lineSize) winner = true;
                }
            }
        }
        return winner;
    }
}
