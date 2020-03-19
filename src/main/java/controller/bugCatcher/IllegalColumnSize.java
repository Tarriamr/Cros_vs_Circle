package controller.bugCatcher;

public class IllegalColumnSize extends Throwable {

    public IllegalColumnSize() {
    }

    public IllegalColumnSize(String bug) {
        super(bug);
    }
}
