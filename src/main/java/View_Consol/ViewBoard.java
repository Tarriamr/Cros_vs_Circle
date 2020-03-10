package View_Consol;

import Model.BoardField;

public class ViewBoard {
    public static void main(String[] args) {
        String choice = " ";

        BoardField boardField = new BoardField(choice);
        System.out.println();
        System.out.println(boardField.toString());
        System.out.println();

    }
}
