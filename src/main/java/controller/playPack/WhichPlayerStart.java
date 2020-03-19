package controller.playPack;

import controller.Player1;
import controller.Player2;
import model.Player;

import java.util.Random;

public class WhichPlayerStart {

    public Player playerStart() {
        Random random = new Random();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        if (random.nextInt(2) % 2 == 0) {
            System.out.println(player1.getNick() + " will start the game.");
            return player1;
        } else {
            System.out.println(player2.getNick() + "will start the game.");
            return player2;
        }
    }
}
