package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NodeTest {
    private Node<Integer> first;
    private Node<Integer> two;
    private Node<Integer> third;
    private Node<Integer> four;

    @Before
    public void setUp() throws Exception {
        first = new Node<>(1);
        two = new Node<>(2);
        third = new Node<>(3);
        four = new Node<>(4);
    }

    @Test
    public void whenHasntCycleReturnFalse() {
        assertThat(first.hasCycle(first), is(false));
    }

    @Test
    public void whenHasCycleReturnTrue() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
        assertThat(first.hasCycle(first), is(true));
    }
}
