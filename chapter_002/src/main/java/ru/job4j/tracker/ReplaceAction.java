package ru.job4j.tracker;

public class ReplaceAction extends BaseAction {
    protected ReplaceAction(int key, String name) {
        super(key, name);
    }

    @Override
    public String name() {
        return "=== Replace item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        System.out.print("Enter name of new Item: ");
        String name = input.askStr("");
        Item item = new Item(name);
        tracker.replace(id, item);
        return true;
    }
}
