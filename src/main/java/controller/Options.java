package controller;

import view.consol.viewPack.ViewPlayOptions;
import view.consol.viewPack.ViewPlayersOptions;
import view.consol.viewPack.ViewStart;

import java.util.Scanner;

public class Options {
    Scanner scanner = new Scanner(System.in);


    public void menuOptions(String choiceOptions) {
        switch (choiceOptions) {
            case "1":
                new ViewPlayersOptions().menuPlayersOptions();
                break;
            case "2":
                new ViewPlayOptions().menuPlayOptions();
                break;
            case "3":
                new ViewStart().menuStart();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.print("    There is no such option.\n\n" +
                        "    Choose the correct number:   ");
                menuOptions(scanner.next());
                System.out.println();
        }
    }
}
