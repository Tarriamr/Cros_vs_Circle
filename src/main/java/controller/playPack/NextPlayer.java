package controller.playPack;

import controller.Play;
import model.Board;
import model.Player;

public class NextPlayer {

    public Player getNextPlayer() {
        if (player1Counter() > player2Counter()) {
            return Play.getPlayer2();
        } else if (player1Counter() < player2Counter()) {
            return Play.getPlayer1();
        } else {
            return PlayerOrder.getPlayerOrder()[0];
        }
    }

    private int player1Counter() {
        int counter = 0;
        for (int i = 0; i < Board.getSizeRow(); i++) {
            for (int j = 0; j < Board.getSizeColumn(); j++) {
                if (Play.getPlayer1().getChoiceField(i, j) != null)
                    counter += 1;
            }
        }
        return counter;
    }

    private int player2Counter() {
        int counter = 0;
        for (int i = 0; i < Board.getSizeRow(); i++) {
            for (int j = 0; j < Board.getSizeColumn(); j++) {
                if (Play.getPlayer2().getChoiceField(i, j) != null)
                    counter += 1;
            }
        }
        return counter;
    }
}
