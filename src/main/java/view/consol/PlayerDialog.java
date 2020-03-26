package view.consol;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class PlayerDialog {
    private Map<Integer, String> playerTurn = new LinkedHashMap<>();

    private void setPlayerTurn() {
        playerTurn.put(1, ", it's time for Your move:   ");
        playerTurn.put(2, ", now Your turn:   ");
        playerTurn.put(3, ", select the next field:   ");
        playerTurn.put(4, ", maybe this time it will go better:   ");
        playerTurn.put(5, ", next move, next chance:   ");
    }

    public String getPlayerTurn() {
        setPlayerTurn();
        Random random = new Random();
        return playerTurn.get(random.nextInt(5)+1);
    }
}
