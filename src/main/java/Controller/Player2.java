package Controller;

public class Player2 implements Player {
    Board board = new Board();
    private String nick = "Player 2";
    private String playSymbol = "O";
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
