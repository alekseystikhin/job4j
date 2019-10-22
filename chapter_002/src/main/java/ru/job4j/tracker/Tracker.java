package ru.job4j.tracker;

import java.util.Random;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
     * @param id   ID элемента в массиве.
     * @param item Элемент, которым будет произведена замена.
     * @return True, если удалось заменить ячейку в массиве, иначе false.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if (id.equals(this.items[i].getId())) {
                this.items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @param id ID элемента в массиве.
     * @return True, если ячейка массива удалена, иначе false.
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                if (id.equals(this.items[i].getId())) {
                    this.items[i] = null;
                    System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * @return Копия массива без null-элементов.
     */
    public Item[] findAll() {
        int count = 0;
        for (Item i : this.items) {
            if (i != null) {
                count++;
            }
        }
        Item[] itemsArrayWithoutNull = new Item[count];

        for (int i = 0, j = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                itemsArrayWithoutNull[j++] = this.items[i];
            }
        }
        return itemsArrayWithoutNull;
    }

    /**
     * @param key - ключевое слово для поиска.
     * @return Массив элементов, у которых name равно key.
     */
    public Item[] findByName(String key) {
        int count = 0;
        for (Item item : this.items) {
            if (item != null) {
                if (key.equals(item.getName())) {
                    count++;
                }
            }
        }
        Item[] itemsArray = new Item[count];

        for (int i = 0, j = 0; i < this.items.length; i++) {
            if (this.items[i] != null) {
                if (key.equals(this.items[i].getName())) {
                    itemsArray[j++] = this.items[i];
                }
            }
        }
        return itemsArray;
    }

    /**
     * @param id ID для поиска элемента.
     * @return Найденный элемент или null, если элемент не найден.
     */
    public Item findById(String id) {
        Item foundItem = null;
        for (Item item : this.items) {
            if (item != null) {
                if (id.equals(item.getId())) {
                    foundItem = item;
                    break;
                }
            }
        }
        return foundItem;
    }
}