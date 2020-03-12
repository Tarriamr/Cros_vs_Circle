package Controller;

public class  Decode {
    private String choice;

    public Decode(String choice) {
        this.choice = choice;
    }

    //todo check choice(field ID) and UpperCase input

    public int[] getDecode() {
        char[] code = choice.toCharArray();
        return new int[]{
                code[0] - 65, code[1] - 49
        };
    }
}
