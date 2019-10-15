package ru.job4j.array;

public class FindLoop {
    /**
     * @return result - индекс элемента в массиве.
     * Если элемента нет в массиве, то -1.
     */
    public int indexOf(int[] data, int el) {
        int result = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * @return result - индекс элемента в массиве.
     * Если элемента нет в массиве, то -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                result = index;
                break;
            }
        }
        return result;
    }
}