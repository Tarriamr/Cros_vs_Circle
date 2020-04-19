package controller;

import controller.playPack.PlayerDialog;
import controller.playPack.PlayerOrder;
import model.Board;
import view.consol.BoardField;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    PlayerDialog playerDialog = new PlayerDialog();
    Play play = new Play();
    BoardField boardField = new BoardField();

    public void basicOptions() {
        Play.getPlayer1().setNick("Player_1");
        Play.getPlayer1().setPlaySymbol("X");
        Play.getPlayer2().setNick("Player_2");
        Play.getPlayer2().setPlaySymbol("O");
        Board.setSizeRow("3");
        Board.setSizeColumn("3");
    }

    public void origin() {
        System.out.println("    The game will start:   " + PlayerOrder.getPlayerOrder()[0].getNick().toUpperCase());
    }

    public void firstMove() {
        System.out.println(boardField.toString());
        System.out.println();
        System.out.print("    " + PlayerOrder.getPlayerOrder()[0].getNick().toUpperCase() +
                ", it's time for Your move:   ");
        play.firstMove(scanner.next());
    }

    public void nextMove() {
        int counter;
        do {
            System.out.println(boardField.toString());
            System.out.println();
            play.setNextPlayer();

            System.out.print("    " + play.getNextPlayer().getNick().toUpperCase() + playerDialog.getPlayerTurn());
            play.nextMove(scanner.next());
            counter = play.getCounter();
            System.out.print("\n\n");
        } while (Board.getCounter() > 0 && counter != 0);
    }

    public void result() {
        System.out.println(boardField.toString());
        System.out.println();

        if (play.getCounter() != 0) {
            System.out.println("   Congratulations!!! You both win !!!");
        } else {
            System.out.println("   Congratulations!!!   " + play.getNextPlayer().getNick().toUpperCase() +
                    "   wins !!!");
        }
    }
}
