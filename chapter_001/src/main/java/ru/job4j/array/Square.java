package ru.job4j.array;

public class Square {
    /**
     * @param bound - Количество элементов массива.
     * @return result - Массив элементов, начиная с единицы, возведенных в квадрат.
     */
    public int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0, j = 1; i < bound; i++, j++) {
            result[i] = (int) Math.pow(j, 2);
        }
        return result;
    }
}