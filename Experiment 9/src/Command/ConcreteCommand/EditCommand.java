package Command.ConcreteCommand;

import Command.Command.Command;
import Command.Receiver.BoardScreen;

public class EditCommand implements Command {
    private BoardScreen screen;

    public EditCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.edit();
    }
}
