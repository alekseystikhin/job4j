package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = 0;
                while (i < (array.length - index - 1)) {
                    String temp = array[index + i];
                    array[index + i] = array[index + i + 1];
                    array[index + i + 1] = temp;
                    i++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}