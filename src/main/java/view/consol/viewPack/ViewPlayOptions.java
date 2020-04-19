package view.consol.viewPack;

import controller.optionsPack.PlayOptions;
import controller.playPack.Win;
import model.Board;

import java.util.Scanner;

public class ViewPlayOptions {

    Scanner scanner = new Scanner(System.in);
    PlayOptions playOptions = new PlayOptions();

    public void menuPlayOptions() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Play options:                                                                   *\n" +
                        "*         Board size (min. 3, max. 9):                                              *\n" +
                        "*      1. Change row size                                                           *\n" +
                        "*" + new MenuElement().getElement("Actual row size:    ",
                        String.valueOf(Board.getSizeRow()), "", "") + "*\n" +
                        "*      2. Change column size                                                        *\n" +
                        "*" + new MenuElement().getElement("Actual column size: ",
                        String.valueOf(Board.getSizeColumn()), "", "") + "*\n" +
                        "*         Symbol in line (min.3, max is low board size):                            *\n" +
                        "*      3. Change number of characters in the winning line                           *\n" +
                        "*" + new MenuElement().getElement("Actual line size: ",
                        String.valueOf(Win.getLineSize()), "", "") + "*\n" +
                        "*      4. Return to Start menu.                                                     *\n" +
                        "*      5. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose option number:   ");
        playOptions.menuPlayOptions(scanner.next());
    }
}
