package controller.bugCatcher;

public class IllegalRowSize extends Throwable {
    public IllegalRowSize() {
    }

    public IllegalRowSize(String bug) {
        super(bug);
    }
}
