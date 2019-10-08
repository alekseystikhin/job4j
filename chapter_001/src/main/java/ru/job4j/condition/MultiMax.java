package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int maxOfFirstAndSecond = (first > second) ? first : second;
        return (maxOfFirstAndSecond > third) ? maxOfFirstAndSecond : third;
    }
}