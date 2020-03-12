package Controller.PlayPack;

import Controller.Board;
import Controller.Player1;
import Controller.Player2;

public class Move {
    Player1 player1 = new Player1();
    Player2 player2 = new Player2();
    private String player1Symbol = player1.getPlaySymbol(), player2Symbol = player2.getPlaySymbol();
    private String player1Nick = player1.getNick(), player2Nick = player2.getNick();
    private Board player1Board = player1.getBoard(), player2Board = player2.getBoard();
    private String player1ChoiceField = player1.getChoiceField(), player2ChoiceField = player2.getChoiceField();

}
