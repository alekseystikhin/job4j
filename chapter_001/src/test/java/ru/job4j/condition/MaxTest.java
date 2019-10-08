package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when2BiggerThen1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when1BiggerThen2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenEquals() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}