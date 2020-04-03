package view.consol.viewPack;

import controller.optionsPack.StartMenu;

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
                        "*         - Players:   Player_1 vs Player_2                                         *\n" +
                        "*         - Board:     3x3                                                          *\n" +
                        "*         - Win:       3 symbol in line                                             *\n" +
                        "*      2. Getting started with matching options.                                    *\n" +
                        "*         - Players:   two                                                          *\n" +
                        "*         - Board:                                                                  *\n" +
                        "*         - Win:                                                                    *\n" +
                        "*      3. Options.                                                                  *\n" +
                        "*      4. Exit.                                                                     *\n" +
                        "*************************************************************************************\n");
        System.out.print("    Choose option number:   ");
        new StartMenu().menuStart(scanner.next());
    }
}
