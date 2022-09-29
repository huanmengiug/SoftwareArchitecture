package Command;

public class OpenCommand implements Command {
    private BoardScreen screen;

    public OpenCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.open();
    }

}
