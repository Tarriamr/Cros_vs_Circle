package view.consol;

import controller.Play;
import controller.Player1;
import controller.Player2;
import controller.bugCatcher.IllegalBoardSize;
import controller.playPack.NextPlayer;
import model.Player;

import java.util.Scanner;

public class Start {
    private static Player1 player1 = new Player1();
    private static Player2 player2 = new Player2();
    private static Play play = new Play();
    private static Player firstPlayer = play.getFirstPlayer();
    private static Player secondPlayer = play.getSecondPlayer();
    private static Scanner scanner = new Scanner(System.in);
    private static BoardField boardField = new BoardField();

    public static void main(String[] args) throws IllegalBoardSize {

        System.out.println();
        System.out.println("        CROSS   VS   CIRCLE");
        System.out.println();
        System.out.println("Hello player, what's your nickname?");
        System.out.print("   ");
        player1.setNick(new Scanner(System.in).nextLine());
        System.out.println("What is the nickname of the second player?");
        System.out.print("   ");
        player2.setNick(new Scanner((System.in)).nextLine());
        System.out.println();


        System.out.println(boardField.toString());
        System.out.println();

        System.out.println("The game will start: " + firstPlayer.getNick());
        System.out.print(firstPlayer.getNick() + ", it's time for your move: ");
        play.firstMove(scanner.next());
        System.out.println("\n\n");

        System.out.println(boardField.toString());
        System.out.println();



//  testowanie wskazywania następnego gracza
        NextPlayer nextPlayer=new NextPlayer();
        System.out.println(nextPlayer.getPlayer1Counter());
        System.out.println(nextPlayer.getPlayer2Counter());
        System.out.println(nextPlayer.nextPlayer().getNick());
        System.out.println();

        System.out.println(play.getFirstPlayer().getNick());
        System.out.println(play.getSecondPlayer().getNick());
        System.out.println("\n");




        System.out.print(secondPlayer.getNick() + ", now Your turn: ");
        play.nextMove(scanner.next());
        System.out.println("\n\n");

        System.out.println(boardField.toString());
        System.out.println();
        System.out.println();
    }
}
