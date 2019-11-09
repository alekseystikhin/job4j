package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * @param id   ID элемента в списке.
     * @param item Элемент, которым будет произведена замена.
     * @return True, если удалось заменить ячейку в списке, иначе false.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < items.size(); i++) {
            if (id.equals(this.items.get(i).getId())) {
                item.setId(id);
                items.set(i, item);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param id ID элемента в списке.
     * @return True, если элемент списка удален, иначе false.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getId().equals(id)) {
                this.items.remove(i);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @return Копия списка без null-элементов.
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : this.items) {
            if (item != null) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * @param key - ключевое слово для поиска.
     * @return Список элементов, у которых name равно key.
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> newArray = new ArrayList<>(items.size());
        for (Item item : this.items) {
            if (key.equals(item.getName())) {
                newArray.add(item);
            }
        }
        return newArray;
    }

    /**
     * @param id ID для поиска элемента.
     * @return Найденный элемент или null, если элемент не найден.
     */
    public Item findById(String id) {
        Item foundItem = null;
        if (items.size() > 0) {
            for (Item item : this.items) {
                if ((item != null) && (id.equals(item.getId()))) {
                    foundItem = item;
                    break;
                }
            }
        }
        return foundItem;
    }
}