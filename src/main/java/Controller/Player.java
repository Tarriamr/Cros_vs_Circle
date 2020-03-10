package Controller;

public class Player {
    private String nick;
    private String playSymbol = "X";

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPlaySymbol(String playSymbol) {
        this.playSymbol = playSymbol;
    }

    public Player(String playSymbol) {
        this.playSymbol = playSymbol;
        Board.setChoice(this.playSymbol);
    }
}
