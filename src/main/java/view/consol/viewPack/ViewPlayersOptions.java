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
                        "*   Player 1:                                                                       *\n" +
                        "*      1. Change nick.                                                              *\n" +
                        "*" + new MenuElement().getElement("Actual nick:    ", Play.getPlayer1().getNick().trim(),
                        "", "") + "*\n" +
                        "*      2. Change symbol.                                                            *\n" +
                        "*" + new MenuElement().getElement("Actual symbol:  ", Play.getPlayer1().getPlaySymbol(),
                        "","") + "*\n" +
                        "*   Player 2:                                                                       *\n" +
                        "       3. Change nick.                                                              *\n" +
                        "*" + new MenuElement().getElement("Actual nick:    ", Play.getPlayer2().getNick().trim(),
                        "", "") + "*\n" +
                        "*      4. Change symbol.                                                             *\n" +
                        "*" + new MenuElement().getElement("Actual symbol:  ", Play.getPlayer2().getPlaySymbol(),
                        "","") + "*\n" +
                        "*      5. Return to Start menu.                                                     *\n" +
                        "*      6. Quit.                                                                     *\n" +
                        "*************************************************************************************\n"
        );
        System.out.print("    Choose players options number:   ");
        playersOptions.menuPlayerOptions(scanner.next());
    }
}
