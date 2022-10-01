package Command;

import java.util.ArrayList;

import Command.Invoker.MenuItem;

public class Menu {
    public ArrayList<MenuItem> itemList = new ArrayList<MenuItem>();

    public void addMenuItem(MenuItem item) {
        itemList.add(item);
    }
}
