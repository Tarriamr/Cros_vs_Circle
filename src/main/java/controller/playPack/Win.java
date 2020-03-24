package controller.playPack;

import model.Player;

public class Win {
    private Player player;
    private int[] choiceField;
    private int rowSize;
    private int columnSize;
    private int lineSize;

    public boolean getWin(Player player, int[] choiceField, int rowSize, int columnSize, int lineSize) {
        this.player = player;
        this.choiceField = choiceField;
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.lineSize = lineSize;
        return winNS() || winEW();
    }

    private boolean winNS() {
        int sum = 0;
        boolean winner = false;
        for (int i = 0; i < lineSize; i++) {
            if (((choiceField[0] - (lineSize - 1)) + i >= 0) && ((choiceField[0] + i) <= (rowSize - 1))) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField(((rowSize - choiceField[0] - 1) - i + j), choiceField[1]) != null) {
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
            if (((choiceField[1] - (lineSize - 1)) + i >= 0) && ((choiceField[1] + i) <= (columnSize - 1))) {
                for (int j = 0; j < lineSize; j++) {
                    if (player.getChoiceField(choiceField[0], ((columnSize - choiceField[1] - 1) - i + j)) != null) {
                        sum += 1;
                    }
                    if (sum == lineSize) winner = true;
                }
            }
        }
        return winner;
    }
}
