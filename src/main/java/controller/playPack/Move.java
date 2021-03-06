package controller.playPack;

import controller.bugCatcher.IllegalBoardSize;
import model.Board;
import model.Decode;

public class Move {

    public int[] playerMove(String playerMove) throws IllegalBoardSize {
        int[] playerDecode = new Decode(playerMove).getDecode();

        if ((playerDecode[0] < 0 || playerDecode[0] > (Board.getSizeRow() - 1)) || (playerDecode[1] < 0 || playerDecode[1] > (Board.getSizeColumn() - 1)))
            throw new IllegalBoardSize();

        if (checkField(playerDecode[0], playerDecode[1])) {
            return playerDecode;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean checkField(int row, int column) {
        return Board.getBoardField(row, column) == null;
    }
}
