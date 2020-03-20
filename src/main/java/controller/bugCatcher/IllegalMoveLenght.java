package controller.bugCatcher;

public class IllegalMoveLenght extends Throwable {

    public IllegalMoveLenght() {
    }

    public IllegalMoveLenght(String bug) {
        super(bug);
    }
}
