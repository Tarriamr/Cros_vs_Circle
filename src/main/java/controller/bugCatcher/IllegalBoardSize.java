package controller.bugCatcher;

public class IllegalBoardSize extends Throwable {
    public IllegalBoardSize() {
    }

    public IllegalBoardSize(String bug) {
        super(bug);
    }
}
