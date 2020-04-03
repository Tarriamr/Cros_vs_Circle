package view.consol;

import controller.Game;
import view.consol.viewPack.ViewStart;

public class StartGame {
    private Game game = new Game();


    public static void main(String[] args) {
        new ViewStart().menuStart();
        System.out.print("\n");
    }

    public void quickStartGame() {
        game.basicOptions();
        System.out.print("\n");
        System.out.print("*************************************************************************************\n\n");
        game.origin();
        System.out.print("\n");
        System.out.print("*************************************************************************************\n\n");
        game.firstMove();
        System.out.print("\n\n");
        game.nextMove();
        System.out.print("\n");
        System.out.print("*************************************************************************************\n\n");
        game.result();
        System.out.print("\n");
        System.out.print("*************************************************************************************\n\n");
    }
}
