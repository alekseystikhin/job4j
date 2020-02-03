package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

@SuppressWarnings("unchecked")
public class SimpleArray<T> implements Iterable<T> {
    private final Object[] array;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public SimpleArray(int value) {
        this.array = new Object[value];
    }

    public void add(T model) {
        if (this.array.length != this.size) {
            this.array[this.size++] = model;
        }
    }

    public void set(int index, T model) {
        if (index <= this.size) {
            this.array[index] = model;
        }
    }

    public void remove(int index) {
        --size;
        System.arraycopy(this.array, index + 1, this.array, index, this.size - index);
        this.array[this.size] = null;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        if ((index < 0) && (index >= this.size)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) this.array[index];
    }

    public int indexOf(T element) {
            for (int i = 0; i < size; i++) {
                if (Objects.equals(element, array[i])) {
                    return i;
                }
            }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index;

            @Override
            public boolean hasNext() {
                return this.index != size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) array[this.index++];
            }
        };
    }
}
