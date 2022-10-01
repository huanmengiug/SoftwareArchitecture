package Command;

import Command.Command.Command;
import Command.ConcreteCommand.CreateCommand;
import Command.ConcreteCommand.EditCommand;
import Command.ConcreteCommand.OpenCommand;
import Command.Invoker.MenuItem;
import Command.Receiver.BoardScreen;

public class Client {
    public static void main(String args[]) throws Exception {
        BoardScreen screen = new BoardScreen();
        Menu menu = screen.getMenu();

        Command openCommand, createCommand, editCommand;
        openCommand = new OpenCommand(screen);
        createCommand = new CreateCommand(screen);
        editCommand = new EditCommand(screen);

        MenuItem openItem, createItem, editItem;
        openItem = menu.itemList.get(0);
        createItem = menu.itemList.get(1);
        editItem = menu.itemList.get(2);

        openItem.setCommand(openCommand);
        createItem.setCommand(createCommand);
        editItem.setCommand(editCommand);

        screen.display();
        openItem.click();
        createItem.click();
        editItem.click();
    }

}
