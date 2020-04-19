package controller.optionsPack;

import controller.Play;
import model.Player;
import view.consol.viewPack.ViewPlayersOptions;
import view.consol.viewPack.ViewStart;

import java.util.Scanner;

public class PlayersOptions {
    Scanner scanner = new Scanner(System.in);


    public void menuPlayerOptions(String choicePlayersOptions) {
        switch (choicePlayersOptions) {
            case "1":
                System.out.print("    What nickname would you like to use:   ");
                Play.getPlayer1().setNick(scanner.next());
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "2":
                System.out.print("    What symbol do you want to use:   ");
                changePlayerSymbol(Play.getPlayer1(), scanner.next());
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "3":
                System.out.print("    What nickname would you like to use:   ");
                Play.getPlayer2().setNick(scanner.next());
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "4":
                System.out.print("    What symbol do you want to use:   ");
                changePlayerSymbol(Play.getPlayer2(), scanner.next());
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "5":
                new ViewStart().menuStart();
                break;
            case "6":
                System.exit(0);
                break;
            default:
                System.out.print("    There is no such option.\n\n" +
                        "    Choose the correct number:   ");
                menuPlayerOptions(scanner.next());
                System.out.println();
        }
    }


    private void changePlayerSymbol(Player player, String symbol) {
        if (symbol.length() == 1) {
            player.setPlaySymbol(symbol);
        } else {
            System.out.println("    An incorrect symbol has been entered and has not been changed.");
            System.out.println();
            System.out.print("    Choose next players options number:   ");
            menuPlayerOptions(scanner.next());
            System.out.println();
        }
    }
}
