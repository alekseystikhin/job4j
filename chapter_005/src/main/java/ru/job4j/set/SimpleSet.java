package ru.job4j.set;

import ru.job4j.generic.SimpleArray;

import java.util.Iterator;

public class SimpleSet<E> implements Iterable<E> {
    SimpleArray<E> array;

    public SimpleSet(int value) {
        array = new SimpleArray<>(value);
    }

    public void add(E e) {
        if (array.indexOf(e) == -1) {
            array.add(e);
        }
    }

    public int getSize() {
        return array.getSize();
    }

    @Override
    public Iterator<E> iterator() {
        return array.iterator();
    }

}
