package controller.optionsPack;

import controller.playPack.Win;
import model.Board;
import view.consol.viewPack.ViewPlayOptions;
import view.consol.viewPack.ViewStart;

import java.util.Scanner;

public class PlayOptions {
    Scanner scanner = new Scanner(System.in);


    public void menuPlayOptions(String choiceOptions) {
        switch (choiceOptions) {
            case "1":
                System.out.print("    What size row would you like to use:   ");
                Board.setSizeRow(scanner.next());
                new ViewPlayOptions().menuPlayOptions();
                break;
            case "2":
                System.out.print("    What size column would you like to use:   ");
                Board.setSizeColumn(scanner.next());
                new ViewPlayOptions().menuPlayOptions();
                break;
            case "3":
                System.out.print("    What length of line would you like to use:   ");
                Win.setLineSize(scanner.next());
                new ViewPlayOptions().menuPlayOptions();
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
                menuPlayOptions(scanner.next());
                System.out.println();
        }
    }
}
