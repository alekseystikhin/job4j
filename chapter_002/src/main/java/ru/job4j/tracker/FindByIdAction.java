package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.print("Enter Id: ");
        String id = input.askStr("");
        Item foundItem = tracker.findById(id);
        if (foundItem != null) {
            System.out.println("Id заявки: " + foundItem.getId() + " Имя заявки: " + foundItem.getName());
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;
    }
}
