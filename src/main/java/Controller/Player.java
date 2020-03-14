package Controller;

public interface Player {

    String getNick();

    void setNick(String nick);

    String getPlaySymbol();

    void setPlaySymbol(String playSymbol);

    String getChoiceField(int row, int column);

    void setChoiceField(int row, int column);
}
