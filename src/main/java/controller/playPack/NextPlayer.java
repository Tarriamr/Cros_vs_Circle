package controller.playPack;

import controller.Player1;
import controller.Player2;
import model.Board;
import model.Player;

public class NextPlayer {
    private static Player1 player1 = new Player1();
    private static Player2 player2 = new Player2();


    public Player nextPlayer() {
        if (getPlayer1Counter() > getPlayer2Counter()) {
            return player2;
        } else if (getPlayer1Counter() < getPlayer2Counter()) {
            return player1;
        } else {
            return WhichPlayerStart.playerStart();
        }
    }

    public int getPlayer1Counter() {
        int player1Counter = 0;
        for (int i = 0; i < Board.getSizeRow(); i++) {
            for (int j = 0; j < Board.getSizeColumn(); j++) {
                String field = player1.getChoiceField(i, j);
                if (field != null) player1Counter += 1;
            }
        }
        return player1Counter;
    }

    public int getPlayer2Counter() {
        int player2Counter = 0;
        for (int i = 0; i < Board.getSizeRow(); i++) {
            for (int j = 0; j < Board.getSizeColumn(); j++) {
                String field = player2.getChoiceField(i, j);
                if (field != null) player2Counter += 1;
            }
        }
        return player2Counter;
    }
}
