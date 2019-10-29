package ru.job4j.singleton;

public class TrackerSingleForth {
    private TrackerSingleForth() {
    }

    public static TrackerSingleForth getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final TrackerSingleForth INSTANCE = new TrackerSingleForth();
    }
}
