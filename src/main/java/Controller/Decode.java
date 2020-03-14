package Controller;

public class Decode {
    private String choice;

    public Decode(String choice) {
        this.choice = choice.toUpperCase();
    }

    public int[] getDecode() {
        char[] code = choice.toCharArray();
        if (choice.length() == 2) {
            return new int[]{
                    code[0] - 65, code[1] - 49
            };
        } else {
            System.out.println("The field number was entered incorrectly, insert it again.");
            return new int[]{99, 99};
        }
    }
}
