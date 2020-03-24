package controller;

import controller.bugCatcher.IllegalBoardSize;
import controller.bugCatcher.IllegalMoveLenght;
import controller.playPack.Move;
import controller.playPack.PlayerOrder;
import model.Board;
import model.HumanPlayer;
import model.Player;

import java.util.Scanner;

public class Play {

    private static Player player1= new HumanPlayer("player1", "X");
    private static Player player2=new HumanPlayer("player2","O");

    private Player[] playerOrder = PlayerOrder.getPlayerOrder();
    private Scanner scanner= new Scanner(System.in);

    public Play() {
        PlayerOrder.setPlayerOrder();
    }


    public static Player getPlayer1() {
        return player1;
    }

    public static Player getPlayer2() {
        return player2;
    }


    public void firstMove(String playerMove) throws IllegalMoveLenght {
        int[] choice = bugMove(PlayerOrder.getPlayerOrder()[0], playerMove);
        PlayerOrder.getPlayerOrder()[0].setChoiceField(choice[0], choice[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    public void nextMove(String playerMove) throws IllegalMoveLenght {
        int[] choice = bugMove(PlayerOrder.getPlayerOrder()[1], playerMove);
        PlayerOrder.getPlayerOrder()[1].setChoiceField(choice[0], choice[1]);
        Board.setCounter(Board.getCounter() - 1);
    }

    private int[] bugMove(Player player, String playerMove) throws IllegalMoveLenght {
        Move move = new Move();
        try {
            return move.playerMove(playerMove);
        } catch (IllegalBoardSize bug) {
            System.out.println(player.getNick() + " the field number entered is from outside the board, please enter a valid field number.");
            return bugMove(player, scanner.next());
        } catch (IllegalArgumentException bug) {
            System.out.println(player.getNick() + " the field entered is already taken, select another.");
            return bugMove(player, scanner.next());
        }
    }
}
