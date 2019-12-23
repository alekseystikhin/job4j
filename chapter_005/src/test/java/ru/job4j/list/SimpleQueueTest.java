package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleQueueTest {
    SimpleQueue<Integer> queue = new SimpleQueue<>();

    @Before
    public void setUp() throws Exception {
        queue.push(1);
        queue.push(2);
        queue.push(3);
    }

    @Test
    public void pollTest() {
        assertThat(queue.poll(), is(1));
        assertThat(queue.poll(), is(2));
        assertThat(queue.poll(), is(3));
    }
}
