package controller;

import controller.bugCatcher.IllegalColumnSize;
import controller.bugCatcher.IllegalRowSize;
import controller.playPack.Move;
import controller.playPack.NextPlayer;
import controller.playPack.WhichPlayerStart;
import model.Board;
import model.Player;

import java.util.Scanner;

public class Play {
    private static Player firstPlayer = new WhichPlayerStart().playerStart();
    Scanner scanner = new Scanner(System.in);
    private int[] move;
    private Player nextPlayer = new NextPlayer().nextPlayer();

    public Player getNextPlayer() {
        return nextPlayer;
    }

    public static Player getFirstPlayer() {
        return firstPlayer;
    }

    private int[] bugMove(String playerMove) throws IllegalColumnSize, IllegalRowSize {
        try {
            return Move.playerMove(playerMove);
        } catch (IllegalRowSize bug) {
            System.out.println(firstPlayer.getNick() + " the row number entered is from outside the board, please enter" +
                    " a valid field number.");
            return Move.playerMove(scanner.next());
        } catch (IllegalColumnSize bug) {
            System.out.println(firstPlayer.getNick() + " the column number entered is from outside the board, please " +
                    "enter a valid field number.");
            return Move.playerMove(scanner.next());
        } catch (IllegalArgumentException bug) {
            System.out.println(firstPlayer.getNick() + " the field entered is already taken, select another.");
            return Move.playerMove(scanner.next());
        }
    }

    public void firstMove(String playerMove) throws IllegalColumnSize, IllegalRowSize {
        Play play = new Play();
        move = play.bugMove(playerMove);
        firstPlayer.setChoiceField(move[0], move[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    public void nextMove(String playerMove) throws IllegalColumnSize, IllegalRowSize {
        do {
            Play play = new Play();
            move = play.bugMove(playerMove);
            nextPlayer.setChoiceField(move[0], move[1]);
            Board.setCounter(Board.getCounter() - 1);
        } while (Board.getCounter() > 0);
    }
}
