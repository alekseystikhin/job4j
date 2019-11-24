package ru.job4j.iterator;

import java.util.Iterator;

public class MatrixIterator implements Iterator {
    private int[][] matrix;
    private int i;
    private int j;

    public MatrixIterator(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public Integer next() {
        int result = -1;
        if (i < this.matrix.length) {
            result = this.matrix[i][j++];
            if (j == this.matrix[i].length) {
                j = 0;
                i++;
            }
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return (i < matrix.length) && (j < matrix[i].length);
    }
}
