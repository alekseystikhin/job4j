package ru.job4j.count;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountTest {
    @Test
    public void countTest() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        Integer actual = new Count().count(integers);
        Integer expected = 56;
        assertThat(actual, is(expected));
    }
}
