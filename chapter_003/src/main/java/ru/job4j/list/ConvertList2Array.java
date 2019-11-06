package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int i = 0;
        int j = 0;
        for (Integer element : list) {
            array[i][j++] = element;
            if (j == cells) {
                j = 0;
                i++;
            }
        }
        return array;
    }

    public List<Integer> convert(List<int[]> list) {
        List<Integer> newList = new ArrayList<>();
        for (int[] i : list) {
            for (int j : i) {
                newList.add(j);
            }
        }
        return newList;
    }
}
