package Controller;

import java.util.Map;

public class Options {
    private static int sizeRow = 3, sizeColumn = 3;
    private static Map<String, Integer> sizeBoard;

    public Options(int sizeRow, int sizeColumn) {
        sizeBoard.put("sizeRow", sizeRow);
        sizeBoard.put("sizeColumn", sizeColumn);
    }

    public static Map<String, Integer> getSizeBoard() {
        return sizeBoard;
    }
    public static int getSizeColumn() {
        return sizeColumn;
    }

    public static int getSizeRow() {
        return sizeRow;
    }
}
