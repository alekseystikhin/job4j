package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0) {
                    table[i][j] = i + 1;
                } else {
                    table[i][j] = table[i][0] + table[i][j - 1];
                }
            }
            System.out.println();
        }
        return table;
    }
}