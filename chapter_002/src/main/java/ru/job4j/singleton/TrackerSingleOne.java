package ru.job4j.singleton;

public enum TrackerSingleOne {
    INSTANCE;

    TrackerSingleOne() {
    }

    public static void main(String[] args) {
        TrackerSingleOne tracker = TrackerSingleOne.INSTANCE;
    }
}