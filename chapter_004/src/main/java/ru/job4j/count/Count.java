package ru.job4j.count;

import java.util.List;

public class Count {
    public Integer count(List<Integer> data) {
        return data.stream()
                .filter(number -> number % 2 == 0)
                .map(x -> x * x)
                .reduce(0, (x, y) -> x + y);
    }
}
