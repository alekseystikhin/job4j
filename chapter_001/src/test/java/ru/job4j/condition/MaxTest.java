package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void when1BiggerThen2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void when2BiggerThen1() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when3Bigger() {
        int result = Max.max(2, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when4Bigger() {
        int result = Max.max(2, 1, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEquals2() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenEquals3() {
        int result = Max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenEquals4() {
        int result = Max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}