package ru.job4j.generic;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SimpleArrayTest {
    private SimpleArray<Integer> array = new SimpleArray<>(3);

    @Test
    public void addTest() {
        array.add(1);
        array.add(2);
        array.add(3);
        assertThat(array.get(0), is(1));
        assertThat(array.get(1), is(2));
        assertThat(array.get(2), is(3));
    }

    @Test
    public void setTest() {
        array.add(1);
        array.set(0, 2);
        assertThat(array.get(0), is(2));
    }

    @Test
    public void removeTest() {
        array.add(1);
        array.add(2);
        array.remove(0);
        assertThat(array.get(0), is(2));
        assertThat(array.getSize(), is(1));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getTest() {
        array.add(1);
        array.add(2);
        assertThat(array.get(0), is(1));
        array.get(3);
    }

    @Test(expected = NoSuchElementException.class)
    public void iteratorTest() {
        array.add(1);
        array.add(2);
        Iterator<Integer> it = array.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(false));
        it.next();
    }
}
