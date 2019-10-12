package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (i == 0) continue;
            if (data[i] != data[i - 1]) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}