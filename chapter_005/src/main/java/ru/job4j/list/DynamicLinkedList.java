package ru.job4j.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicLinkedList<E> implements Iterable<E> {
    private long modCount;
    private Node<E> last;
    private int size;

    public void add(E data) {
        modCount++;
        Node<E> newLink = new Node<>(data);
        if (this.last == null) {
            this.last = newLink;
            this.last.next = newLink;
        } else {
            newLink.next = this.last.next;
            this.last.next = newLink;
            last = newLink;
        }
        this.size++;
    }

    E get(int index) {
        Node<E> result = this.last.next;
        if (index >= this.size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        }
        return result.data;
    }

    public int size() {
        return this.size;
    }

    private class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> current = last.next;
            final long expectedModCount = modCount;

            @Override
            public boolean hasNext() throws ConcurrentModificationException {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E result = current.data;
                current = current.next;
                if (current == last.next) {
                    current = null;
                }
                return result;
            }
        };
    }
}
