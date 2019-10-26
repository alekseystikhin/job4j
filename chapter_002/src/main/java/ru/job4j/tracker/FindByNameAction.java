package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter name: ");
        String name = input.askStr("");
        Item[] foundItems = tracker.findByName(name);
        if (foundItems.length > 0) {
            System.out.println("Найденные заявки: ");
            for (Item item : foundItems) {
                System.out.println("Id заявки: " + item.getId() + " Имя заявки: " + item.getName());
            }
        } else {
            System.out.println("Заявок не найдено");
        }
        return true;
    }
}
