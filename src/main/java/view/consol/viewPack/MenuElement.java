package view.consol.viewPack;

import java.util.Arrays;

public class MenuElement {
    private String element = "";

    public String getElement(String firstElement, String conjunction, String secondElement) {
        menu(firstElement, conjunction, secondElement);
        return element;
    }


    private void menu(String firstElement, String conjunction, String secondElement) {

        char[] line = new char[60];
        int busyFields = 0;
        StringBuilder result = new StringBuilder();

        conjunction = " " + conjunction + " ";

        Arrays.fill(line, ' ');

        for (char c : firstElement.trim().toCharArray()) {
            line[busyFields] = c;
            busyFields += 1;
        }

        for (int i = 0; i < conjunction.length(); i++) {
            line[busyFields] = conjunction.toCharArray()[i];
            busyFields += 1;
        }

        for (char c : secondElement.trim().toCharArray()) {
            line[busyFields] = c;
            busyFields += 1;
        }

        for (char c : line) {
            element += c;
        }
    }
}
