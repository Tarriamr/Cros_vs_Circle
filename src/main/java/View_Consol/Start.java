package View_Consol;

import Controller.Player1;
import Controller.Player2;
import Model.BoardField;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();

        System.out.println();
        System.out.println("        CROSS   VS   CIRCLE");
        System.out.println();
        System.out.println("Hello player, what's your nickname?");
        System.out.print("   ");
        player1.setNick(new Scanner(System.in).nextLine());
        System.out.println("What is the nickname of the other player?");
        System.out.print("   ");
        player2.setNick(new Scanner((System.in)).nextLine());

        String choice = " ";

        System.out.println();
        BoardField boardField = new BoardField(choice);
        System.out.println(boardField.toString());
    }
}
