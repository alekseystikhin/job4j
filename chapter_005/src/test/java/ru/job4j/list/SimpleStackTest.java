package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleStackTest {
    SimpleStack<Integer> stack = new SimpleStack<>();

    @Before
    public void setUp() throws Exception {
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    public void pollTest() {
        assertThat(stack.poll(), is(3));
        assertThat(stack.poll(), is(2));
        assertThat(stack.poll(), is(1));
    }
}