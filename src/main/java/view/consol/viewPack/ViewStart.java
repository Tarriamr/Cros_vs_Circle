package view.consol.viewPack;

import controller.Play;
import controller.optionsPack.StartMenu;
import model.Board;

import java.util.Scanner;

public class ViewStart {
    Scanner scanner = new Scanner(System.in);

    public void menuStart() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Start menu:                                                                     *\n" +
                        "*      1. Quick start game:                                                         *\n" +
                        "*          - Players:   Player_1 vs Player_2                                        *\n" +
                        "*          - Board:     3 x 3                                                       *\n" +
                        "*          - Win:       3 symbol in line                                            *\n" +
                        "*      2. Getting started with matching options.                                    *\n" +
                        "*          - Players:   " + new MenuElement().getElement(Play.getPlayer1().getNick().trim(),
                        "vs", Play.getPlayer2().getNick().trim()) + "*\n" +
                        "*          - Board:     " + new MenuElement().getElement(String.valueOf(Board.getSizeRow()),
                        "x", String.valueOf(Board.getSizeColumn())) + "*\n" +
                        "*          - Win:       " + new MenuElement().getElement(String.valueOf(3),
                        "symbols in line", "") + "*\n" +
                        "*      3. Options.                                                                  *\n" +
                        "*      4. Exit.                                                                     *\n" +
                        "*************************************************************************************\n");
        System.out.print("    Choose option number:   ");
        new StartMenu().menuStart(scanner.next());
    }
}
