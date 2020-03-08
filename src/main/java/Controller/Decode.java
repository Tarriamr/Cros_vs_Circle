package Controller;

public class Decode {
    private String choice;

    public Decode(String choice) {
        this.choice = choice;
    }

    public int[] getDecode() {
        char[] code = choice.toCharArray();
        return new int[]{
                code[0] - 65, code[1] - 49
        };
    }
}
