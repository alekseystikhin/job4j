package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("");
        Item[] foundItems = tracker.findByName(name);
        if (foundItems.length > 0) {
            for (Item item : foundItems) {
                System.out.println(item.getId() + " " + item.getName());
            }
        } else {
            System.out.println("Заявок не найдено");
        }
        return true;
    }
}
