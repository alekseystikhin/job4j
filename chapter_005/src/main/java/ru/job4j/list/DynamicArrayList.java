package ru.job4j.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class DynamicArrayList<E> implements Iterable<E> {
    private int modCount;
    private Object[] array;
    private int size;

    public DynamicArrayList() {
        this.array = new Object[3];
    }

    public void add(E model) {
        modCount++;
        if (this.array.length == size) {
            this.array = Arrays.copyOf(this.array, this.array.length + (this.array.length * 2));
        }
        this.array[this.size++] = model;
    }

    public E get(int index) throws ArrayIndexOutOfBoundsException {
        if ((index < 0) && (index >= this.size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) this.array[index];
    }

    public int size() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index;
            final int expectedModCount = modCount;

            @Override
            public boolean hasNext() throws ConcurrentModificationException {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return this.index != size;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) array[this.index++];
            }
        };
    }
}
