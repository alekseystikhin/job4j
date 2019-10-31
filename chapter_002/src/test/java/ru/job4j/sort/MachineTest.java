package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    Machine machine = new Machine();

    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when20by11() {
        int[] expected = {5, 2, 2};
        int[] rsl = machine.change(20, 11);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when20by0() {
        int[] expected = {10, 10};
        int[] rsl = machine.change(20, 0);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when0by0() {
        int[] expected = {};
        int[] rsl = machine.change(0, 0);
        assertThat(rsl, is(expected));
    }
}