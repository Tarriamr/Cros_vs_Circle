package Controller.PlayPack;

import Controller.Decode;
import Controller.Player1;
import Controller.Player2;

public class Move {
    Player1 player1 = new Player1();
    Player2 player2 = new Player2();
    String playerMove;

    public Move(String playerMove) {
        this.playerMove = playerMove;
        int[] playerDecode = new Decode(playerMove).getDecode();
    }

    private boolean playerCheckField(int row, int column) {
        return !player1.getChoiceField(row, column).equals(" ") && !player2.getChoiceField(row, column).equals(" ");
    }
}
