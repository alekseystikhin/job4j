package ru.job4j.search;

import java.util.Iterator;
import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        Iterator<Task> iterator = tasks.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (iterator.next().getPriority() > task.getPriority()) {
                break;
            }
            i++;
        }
        tasks.add(i, task);
    }

    public Task take() {
        return this.tasks.poll();
    }
}