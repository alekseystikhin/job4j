package ru.job4j.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrackerSingleTest {
    @Test
    public void testSingletonOne() {
        TrackerSingleOne expected = TrackerSingleOne.INSTANCE;
        TrackerSingleOne actual = TrackerSingleOne.INSTANCE;
        assertEquals(expected, actual);
    }

    @Test
    public void testSingletonTwo() {
        TrackerSingleTwo expected = TrackerSingleTwo.getInstance();
        TrackerSingleTwo actual = TrackerSingleTwo.getInstance();
        assertEquals(expected, actual);
    }

    @Test
    public void testSingletonThree() {
        TrackerSingleThree expected = TrackerSingleThree.getInstance();
        TrackerSingleThree actual = TrackerSingleThree.getInstance();
        assertEquals(expected, actual);
    }

    @Test
    public void testSingletonForth() {
        TrackerSingleForth expected = TrackerSingleForth.getInstance();
        TrackerSingleForth actual = TrackerSingleForth.getInstance();
        assertEquals(expected, actual);
    }
}
