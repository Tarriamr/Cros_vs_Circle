package controller.optionsPack;

import model.Player;
import view.consol.viewPack.ViewOptions;
import view.consol.viewPack.ViewPlayersOptions;
import view.consol.viewPack.ViewStart;

import java.util.Scanner;

public class PlayersOptions {
    Scanner scanner = new Scanner(System.in);


    public void menuPlayerOptions(String choicePlayersOptions) {
        switch (choicePlayersOptions) {
            case "1":
                new ViewPlayersOptions().menuPlayer1();
                break;
            case "2":
                new ViewPlayersOptions().menuPlayer2();
                break;
            case "3":
                new ViewOptions().menuOptions();
                break;
            case "4":
                new ViewStart().menuStart();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.print("    There is no such option.\n\n" +
                        "    Choose the correct number:   ");
                menuPlayerOptions(scanner.next());
                System.out.println();
        }
    }

    public void menuPlayer(Player player, String choicePlayer1) {
        switch (choicePlayer1) {
            case "1":
                System.out.println("    Your actual nic is:   " + player.getNick());
                System.out.println();
                System.out.print("    Choose next players options number:   ");
                menuPlayer(player, scanner.next());
                System.out.println();
                break;
            case "2":
                System.out.print("    What nickname would you like to use:   ");
                player.setNick(scanner.next());
                System.out.println();
                System.out.print("    Choose next players options number:   ");
                menuPlayer(player, scanner.next());
                System.out.println();
                break;
            case "3":
                System.out.println("    Your currently used symbol is:   " + player.getPlaySymbol());
                System.out.println();
                System.out.print("    Choose next players options number:   ");
                menuPlayer(player, scanner.next());
                System.out.println();
                break;
            case "4":
                System.out.print("    What symbol do you want to use:   ");
                changePlayerSymbol(player, scanner.next());
                System.out.println();
                System.out.print("    Choose next players options number:   ");
                menuPlayer(player, scanner.next());
                System.out.println();
                break;
            case "5":
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "6":
                new ViewStart().menuStart();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.print("    There is no such option.\n\n" +
                        "    Choose the correct number:   ");
                menuPlayer(player, scanner.next());
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
            menuPlayer(player, scanner.next());
            System.out.println();
        }
    }
}
