package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int requiredSize = list.size();
        while ((requiredSize % rows) != 0) {
            requiredSize++;
        }
        int cells = requiredSize / rows;
        int[][] array = new int[rows][cells];
        int newListIndex = 0;
        for (int[] i : array) {
            int index = 0;
            for (int j : i) {
                if (newListIndex < list.size()) {
                    i[index] = list.get(newListIndex++);
                }
                index++;
            }
        }
        return array;
    }
}
