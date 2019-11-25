package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            private Iterator<Integer> iterator = it.next();

            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return iterator.next();
            }

            @Override
            public boolean hasNext() {
                boolean result = true;
                while (!iterator.hasNext()) {
                    if (!it.hasNext()) {
                        result = false;
                        break;
                    }
                    iterator = it.next();
                }
                return result;
            }
        };
    }
}