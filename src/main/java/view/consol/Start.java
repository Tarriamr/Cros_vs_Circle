package view.consol;

import controller.Play;
import controller.bugCatcher.IllegalMoveLenght;
import controller.playPack.PlayerOrder;
import model.Board;

import java.util.Scanner;

public class Start {

    public static void main(String[] args) throws IllegalMoveLenght {
        Scanner scanner = new Scanner(System.in);
        Play play = new Play();
        BoardField boardField = new BoardField();

        {
            System.out.println("\n\n");
            System.out.println("        CROSS   VS   CIRCLE");
            System.out.println();
            System.out.println("Hello player, what's your nickname?");
            System.out.print("   ");
            Play.getPlayer1().setNick(new Scanner(System.in).nextLine());
            System.out.println("What is the nickname of the second player?");
            System.out.print("   ");
            Play.getPlayer2().setNick(new Scanner((System.in)).nextLine());
            System.out.println();
        }

        {
            System.out.println(boardField.toString());
            System.out.println();

            System.out.println("The game will start:   " + PlayerOrder.getPlayerOrder()[0].getNick());
            System.out.println();
            System.out.print(PlayerOrder.getPlayerOrder()[0].getNick() + ", it's time for your move:   ");
            play.firstMove(scanner.next());
            System.out.println("\n\n");
        }

        {
            int counter = 1;
            do {
                System.out.println(boardField.toString());
                System.out.println();
                play.setNextPlayer();

                System.out.print(play.getNextPlayer().getNick() + ", now Your turn:   ");
                play.nextMove(scanner.next());
                counter = play.getCounter();
                System.out.println("\n\n");
            } while (Board.getCounter() > 0 && counter != 0);
        }

        {
            System.out.println(boardField.toString());
            System.out.println();

            if (play.getCounter()!=0){
                System.out.println("Congratulations!!! You both win !!!");
            }else {
                System.out.println("Congratulations!!!   " + play.getNextPlayer().getNick() + "   wins !!!");
            }
        }
    }
}
