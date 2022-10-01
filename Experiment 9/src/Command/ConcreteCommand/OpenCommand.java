package Command.ConcreteCommand;

import Command.Command.Command;
import Command.Receiver.BoardScreen;

public class OpenCommand implements Command {
    private BoardScreen screen;

    public OpenCommand(BoardScreen screen) {
        this.screen = screen;
    }

    public void execute() {
        screen.open();
    }

}
