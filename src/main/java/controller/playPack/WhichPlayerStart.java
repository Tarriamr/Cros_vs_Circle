package controller.playPack;

import controller.Play;

import java.util.Random;

public class WhichPlayerStart {

    public WhichPlayerStart() {
        Random random = new Random();
        Play play = new Play();

        if (random.nextInt(2) % 2 == 0) {
            new Play().setPlayerOrder(play.getPlayer1(), play.getPlayer2());
        } else {
            new Play().setPlayerOrder(play.getPlayer2(), play.getPlayer1());
        }
    }
}
