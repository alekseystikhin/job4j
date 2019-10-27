package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Find all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.findAll().length > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println(item.getId() + " " + item.getName());
            }
        } else {
            System.out.println("Заявок не найдено");
        }
        return true;
    }
}
