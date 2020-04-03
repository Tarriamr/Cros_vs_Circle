package controller.playPack;

import controller.Play;
import model.Player;

import java.util.Random;

public class PlayerOrder {
    private static Player[] playerOrder = new Player[2];

    public static Player[] getPlayerOrder() {
        return playerOrder;
    }

    public static void setPlayerOrder() {
        Random random = new Random();

        if (random.nextInt(100) % 2 == 0) {
            playerOrder[0] = Play.getPlayer1();
            playerOrder[1] = Play.getPlayer2();
        } else {
            playerOrder[0] = Play.getPlayer2();
            playerOrder[1] = Play.getPlayer1();
        }
    }
}
