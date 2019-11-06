package ru.job4j.tracker;

public class FindAllAction extends BaseAction {
    protected FindAllAction(int key, String name) {
        super(key, name);
    }

    @Override
    public String name() {
        return "=== Find all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.findAll().size() > 0) {
            for (Item item : tracker.findAll()) {
                System.out.println(item.getId() + " " + item.getName());
            }
        } else {
            System.out.println("Заявок не найдено");
        }
        return true;
    }
}
