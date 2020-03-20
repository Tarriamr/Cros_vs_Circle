package controller;

import controller.bugCatcher.IllegalBoardSize;
import controller.bugCatcher.IllegalMoveLenght;
import controller.playPack.WhichPlayerStart;
import model.Board;
import model.Player;

import java.util.Scanner;

public class Play {

    private Player1 player1;
    private Player2 player2;
    private Scanner scanner;
    private static Player[] playerOrder;

    public Play() {
        this.player1 = new Player1();
        this.player2 = new Player2();
        this.scanner = new Scanner(System.in);
        playerOrder = new Player[2];
    }

    public Player1 getPlayer1() {
        return player1;
    }

    public Player2 getPlayer2() {
        return player2;
    }

    public void setPlayerOrder(Player firstPlayer, Player secondPlayer) {
        playerOrder[0] = firstPlayer;
        playerOrder[1] = secondPlayer;
    }


    public void firstMove(String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
        Play play = new Play(whichPlayerStart);
        int[] choice = play.bugMove(firstPlayer, playerMove);
        firstPlayer.setChoiceField(choice[0], choice[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    public void nextMove(String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
        Play play = new Play(whichPlayerStart);
        int[] choice = play.bugMove(secondPlayer, playerMove);
        secondPlayer.setChoiceField(choice[0], choice[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    private int[] bugMove(Player player, String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
        try {
            return move.playerMove(playerMove);
        } catch (IllegalBoardSize illegalBoardSize) {
            System.out.println(player.getNick() + " the field number entered is from outside the board, please enter a valid field number.");
            return move.playerMove(scanner.next());
        } catch (IllegalArgumentException bug) {
            System.out.println(player.getNick() + " the field entered is already taken, select another.");
            return move.playerMove(scanner.next());
        }
    }
}
