package ru.job4j.set;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleSetTest {
    private SimpleSet<Integer> set;

    @Before
    public void setUp() throws Exception {
        set = new SimpleSet<>(3);
        set.add(1);
        set.add(2);
        set.add(2);
    }

    @Test
    public void addTest() {
        assertThat(set.getSize(), is(2));
    }
}
