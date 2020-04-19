package view.consol;

import model.Board;
import model.Player;

public class FieldContent {

    public String toString(Player player) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Board.getSizeRow(); i++) {
            for (int j = 0; j < Board.getSizeColumn(); j++) {
                result.append(player.getChoiceField(i, j));
            }
            if (i < Board.getSizeRow() - 1)
                result.append("\n");
        }
        return result.toString();
    }
}
