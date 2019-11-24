package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {
    private int[] matrix;
    private int index;

    public EvenNumbersIterator(int[] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return matrix[index++];
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < matrix.length; i++) {
            if ((matrix[i] % 2) == 0) {
                index = i;
                result = true;
                break;
            }
        }
        return result;
    }
}
