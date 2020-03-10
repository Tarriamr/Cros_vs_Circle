package Controller;

import java.util.Map;

public class Options {
    private static int sizeRow = 3, sizeColumn = 5;
    private static Map<String, Integer> sizeBoard;

    public Options(int sizeRow, int sizeColumn) {
        sizeBoard.keySet().add("sizeRow");
        sizeBoard.values().add(sizeRow);
        sizeBoard.keySet().add("sizeColumn");
        sizeBoard.values().add(sizeColumn);
        Options.sizeRow = sizeRow;
        Options.sizeColumn = sizeColumn;
    }

    public static Map<String, Integer> getSizeBoard() {
        return sizeBoard;
    }

    public static int getSizeRow() {
        return sizeRow;
    }

    public static int getSizeColumn() {
        return sizeColumn;
    }
}
