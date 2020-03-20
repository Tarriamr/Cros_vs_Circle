package controller;

import controller.bugCatcher.IllegalBoardSize;
import controller.bugCatcher.IllegalMoveLenght;
import controller.playPack.Move;
import controller.playPack.NextPlayer;
import controller.playPack.WhichPlayerStart;
import model.Board;
import model.Player;

import java.util.Scanner;

public class Play {
    NextPlayer nextPlayer = new NextPlayer();
    Scanner scanner = new Scanner(System.in);
    Move move = new Move();
    private Player firstPlayer = WhichPlayerStart.playerStart();
    private Player secondPlayer = nextPlayer.nextPlayer();

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public void firstMove(String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
        Play play = new Play();
        int[] choice = play.bugMove(firstPlayer, playerMove);
        firstPlayer.setChoiceField(choice[0], choice[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    public void nextMove(String playerMove) throws IllegalBoardSize, IllegalMoveLenght {
        Play play = new Play();
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
