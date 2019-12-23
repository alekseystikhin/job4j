package ru.job4j.list;

public class SimpleStack<T> {
    DynamicArrayList<T> list = new DynamicArrayList<>();
    public T poll() {
        return list.delete(list.size() - 1);
    }

    public void push(T value) {
        list.add(value);
    };
}
