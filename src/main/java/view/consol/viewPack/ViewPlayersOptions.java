package view.consol.viewPack;

import controller.Play;
import controller.optionsPack.PlayersOptions;

import java.util.Scanner;

public class ViewPlayersOptions {
    private Scanner scanner = new Scanner(System.in);
    private PlayersOptions playersOptions = new PlayersOptions();

    public void menuPlayersOptions() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Players options:                                                                *\n" +
                        "*      1. Player 1.                                                                 *\n" +
                        "*      2. Player 2.                                                                 *\n" +
                        "*      3. Return to Options menu.                                                   *\n" +
                        "*      4. Return to Start menu.                                                     *\n" +
                        "*      5. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose players options number:   ");
        playersOptions.menuPlayerOptions(scanner.next());
    }

    public void menuPlayer1() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Player 1:                                                                       *\n" +
                        "*      1. Actual nick.                                                              *\n" +
                        "*      2. Change nick.                                                              *\n" +
                        "*      3. Actual symbol.                                                            *\n" +
                        "*      4. Change symbol.                                                            *\n" +
                        "*      5. Return to Players options menu.                                           *\n" +
                        "*      6. Return to Start menu.                                                     *\n" +
                        "*      7. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose players options number:   ");
        playersOptions.menuPlayer(Play.getPlayer1(), scanner.next());
    }

    public void menuPlayer2() {
        System.out.print("\n\n\n\n");
        System.out.print(
                "*************************************************************************************\n" +
                        "*                                CROSS   VS   CIRCLE                                *\n" +
                        "*************************************************************************************\n" +
                        "*   Player 2:                                                                       *\n" +
                        "*      1. Actual nick.                                                              *\n" +
                        "*      2. Change nick.                                                              *\n" +
                        "*      3. Actual symbol.                                                            *\n" +
                        "*      4. Change symbol.                                                            *\n" +
                        "*      5. Return to Players options menu.                                           *\n" +
                        "*      6. Return to Start menu.                                                     *\n" +
                        "*      7. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose players options number:   ");
        playersOptions.menuPlayer(Play.getPlayer2(), scanner.next());
    }
}
