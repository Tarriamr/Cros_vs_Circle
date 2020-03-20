package controller.playPack;

import controller.Player1;
import controller.Player2;
import model.Player;

import java.util.Random;

public class WhichPlayerStart {

    public static Player playerStart() {
        Random random = new Random();
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        if (random.nextInt(2) % 2 == 0) {
            return player1;
        } else {
            return player2;
        }
    }
}
