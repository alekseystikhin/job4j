package ru.job4j.list;

public class SimpleQueue<T> {
    private final SimpleStack<T> in = new SimpleStack<>();
    private final SimpleStack<T> out = new SimpleStack<>();

    public T poll() {
        if (out.size() == 0) {
            while (in.size() != 0) {
                out.push(in.poll());
            }
        }
        return out.poll();
    }

    public void push(T value) {
        in.push(value);
    }
}