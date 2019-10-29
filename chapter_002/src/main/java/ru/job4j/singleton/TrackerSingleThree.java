package ru.job4j.singleton;

public class TrackerSingleThree {
    private static final TrackerSingleThree INSTANCE = new TrackerSingleThree();

    private TrackerSingleThree() {
    }

    public static TrackerSingleThree getInstance() {
        return INSTANCE;
    }
}
