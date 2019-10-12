package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0, j = 1; i < bound; i++, j++) {
            rst[i] = (int) Math.pow(j, 2);
        }
        return rst;
    }
}