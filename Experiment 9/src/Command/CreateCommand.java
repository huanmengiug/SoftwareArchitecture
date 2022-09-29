package Command;

public class CreateCommand implements Command {
    private BoardScreen screen;

    public CreateCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.create();
    }
}
