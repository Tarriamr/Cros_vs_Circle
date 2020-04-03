package controller.optionsPack;

import view.consol.StartGame;
import view.consol.viewPack.ViewOptions;

import java.util.Scanner;

public class StartMenu {

    Scanner scanner = new Scanner(System.in);

    public void menuStart(String choiceOption) {
        switch (choiceOption) {
            case "1":
                new StartGame().quickStartGame();
                break;
            case "2":
            case "3":
                new ViewOptions().menuOptions();
                break;
            case "4":
                System.exit(0);
                break;
            default:
                System.out.print("    There is no such option.\n\n" +
                        "    Choose the correct number:   ");
                menuStart(scanner.next());
        }
    }
}
