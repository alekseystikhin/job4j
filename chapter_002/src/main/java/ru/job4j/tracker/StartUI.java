package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr(""));
            if (select == 0) {
                System.out.println("=== Add new Item ====");
                System.out.print("Enter name of new Item: ");
                String name = input.askStr("");
                Item item = tracker.add(new Item(name));
                System.out.println("Id добавленной заявки: " + item.getId() + " Имя добавленной заявки: " + item.getName());
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                if (tracker.findAll().length > 0) {
                    for (Item item : tracker.findAll()) {
                        System.out.println("Id заявки: " + item.getId() + " Имя заявки: " + item.getName());
                    }
                } else {
                    System.out.println("Заявок не найдено");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter Id: ");
                String id = input.askStr("");
                System.out.print("Enter name of new Item: ");
                String name = input.askStr("");
                Item item = new Item(name);
                String message = tracker.replace(id, item) ? "Заявка заменена" : "Заявка не заменена";
                System.out.println(message);
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter Id: ");
                String id = input.askStr("");
                String message = tracker.delete(id) ? "Заявка удалена" : "Заявка не удалена";
                System.out.println(message);
            } else if (select == 4) {
                System.out.println("=== Find item by Id ====");
                System.out.print("Enter Id: ");
                String id = input.askStr("");
                Item foundItem = tracker.findById(id);
                if (foundItem != null) {
                    System.out.println("Id заявки: " + foundItem.getId() + " Имя заявки: " + foundItem.getName());
                } else {
                    System.out.println("Заявка не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ====");
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.\n"
                + "0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}