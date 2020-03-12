package Controller;

public class Player1 implements Player {
    Board board = new Board();
    private static String nick = "Player 1";
    private static String playSymbol = "X";
    private String choiceField = "";

    @Override
    public String getNick() {
        return nick;
    }

    @Override
    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String getPlaySymbol() {
        return playSymbol;
    }

    @Override
    public void setPlaySymbol(String playSymbol) {
        this.playSymbol = playSymbol;
    }

    @Override
    public String getChoiceField() {
        return choiceField;
    }

    @Override
    public void setChoiceField(String choiceField) {
        this.choiceField = choiceField;
    }

    public Board getBoard() {
        return board;
    }
}
