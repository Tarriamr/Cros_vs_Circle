package controller.playPack;

import controller.Play;
import controller.Player1;
import controller.Player2;
import model.Player;

public class NextPlayer {
    private Player1 player1 = new Player1();
    private Player2 player2 = new Player2();
    private int player1Counter = 0;
    private int player2Counter = 0;

    public Player nextPlayer() {
        if (getPlayer1Counter() > getPlayer2Counter()) {
            return player2;
        } else if (getPlayer1Counter() < getPlayer2Counter()) {
            return player1;
        } else {
            return Play.getFirstPlayer();
        }
    }

    public int getPlayer1Counter() {
        for (String[] field :
                player1.getBoard()) {
            if (field != null) player1Counter += 1;
        }
        return player1Counter;
    }

    public int getPlayer2Counter() {
        for (String[] field :
                player2.getBoard()) {
            if (field != null) player2Counter += 1;
        }
        return player2Counter;
    }
}
