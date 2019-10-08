package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenFirstMax() {
        int result = SqMax.max(4, 1, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = SqMax.max(1, 4, 2, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = SqMax.max(4, 1, 8, 3);
        assertThat(result, is(8));
    }

    @Test
    public void whenForthMax() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenEquals() {
        int result = SqMax.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}
