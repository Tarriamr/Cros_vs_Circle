package controller.playPack;

import controller.bugCatcher.IllegalColumnSize;
import controller.bugCatcher.IllegalRowSize;
import model.Board;
import model.Decode;

public class Move {

    public static int[] playerMove(String playerMove) throws IllegalRowSize, IllegalColumnSize {
        int[] playerDecode = new Decode(playerMove).getDecode();

        if (playerDecode[0] < 0 || playerDecode[0] > (Board.getSizeRow() - 1))
            throw new IllegalRowSize();

        if (playerDecode[1] < 0 || playerDecode[1] > (Board.getSizeColumn() - 1))
            throw new IllegalColumnSize();

        if (checkField(playerDecode[0], playerDecode[1])) {
            return playerDecode;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private static boolean checkField(int row, int column) {
        return Board.getBoardField(row, column) == null;
    }
}
