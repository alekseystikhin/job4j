package ru.job4j.tracker;

import java.util.ArrayList;

public class FindByNameAction extends BaseAction {
    protected FindByNameAction(int key, String name) {
        super(key, name);
    }

    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("");
        ArrayList<Item> foundItems = tracker.findByName(name);
        if (foundItems.size() > 0) {
            for (Item item : foundItems) {
                System.out.println(item.getId() + " " + item.getName());
            }
        } else {
            System.out.println("Заявок не найдено");
        }
        return true;
    }
}
