package controller.playPack;

import controller.bugCatcher.IllegalBoardSize;
import controller.bugCatcher.IllegalMoveLenght;
import model.Board;

public class Move {

    public int[] playerMove(String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
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
