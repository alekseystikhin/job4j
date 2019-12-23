package ru.job4j.list;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("unchecked")
public class DynamicLinkedListTest {
    private DynamicLinkedList<Integer> list = new DynamicLinkedList();

    @Before
    public void setUp() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @After
    public void tearDown() throws Exception {
        list = new DynamicLinkedList();
    }

    @Test
    public void addTest() {
        list.add(4);
        assertThat(list.get(3), is(4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getTest() {
        assertThat(list.get(0), is(1));
        assertThat(list.get(1), is(2));
        assertThat(list.get(2), is(3));
        list.get(3);
    }

    @Test(expected = ConcurrentModificationException.class)
    public void hasNextTest() {
        Iterator<Integer> iter = list.iterator();
        assertThat(iter.hasNext(), is(true));
        iter.next();
        assertThat(iter.hasNext(), is(true));
        iter.next();
        assertThat(iter.hasNext(), is(true));
        list.add(2);
        iter.hasNext();
    }

    @Test(expected = NoSuchElementException.class)
    public void nextTest() {
        Iterator<Integer> iter = list.iterator();
        assertThat(iter.next(), is(1));
        assertThat(iter.next(), is(2));
        assertThat(iter.next(), is(3));
        iter.next();
    }
}
