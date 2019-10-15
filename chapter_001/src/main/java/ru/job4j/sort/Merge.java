package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
            while (k < result.length) {
                if ((i > left.length - 1)) {
                    result[k] = right[j];
                    j++;
                } else if ((j > right.length - 1)) {
                    result[k] = left[i];
                    i++;
                } else if (left[i] < right[j]) {
                    result[k] = left[i];
                    i++;
                } else {
                    result[k] = right[j];
                    j++;
                }
                k++;
            }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] result = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(result));
    }
}