package ru.job4j.tracker;

public class DeleteAction extends BaseAction {
    protected DeleteAction(int key, String name) {
        super(key, name);
    }

    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        tracker.delete(id);
        return true;
    }
}
