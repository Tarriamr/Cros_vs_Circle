package model;

import controller.bugCatcher.IllegalMoveLenght;

public class Decode {
    private String choice;

    public Decode(String choice) {
        this.choice = choice.toUpperCase();
    }

    public int[] getDecode() throws IllegalMoveLenght {
        char[] code = choice.toCharArray();
        if (choice.length() == 2) {
            return new int[]{
                    code[0] - 65, code[1] - 49
            };
        } else {
            throw new IllegalMoveLenght();
        }
    }
}
