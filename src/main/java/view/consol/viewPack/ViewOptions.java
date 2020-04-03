package view.consol.viewPack;

import controller.Options;

import java.util.Scanner;

public class ViewOptions {
    Scanner scanner = new Scanner(System.in);
    Options options = new Options();

    public void menuOptions() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Options:                                                                        *\n" +
                        "*      1. Players settings.                                                         *\n" +
                        "*      2. Play settings.                                                            *\n" +
                        "*      3. Return to Start menu.                                                     *\n" +
                        "*      4. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose option number:   ");
        options.menuOptions(scanner.next());
    }
}
