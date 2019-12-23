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

    public E delete(int index) {
        Node<E> prev = index == 0 ? this.last : findByIndex(index - 1);
        Node<E> temp = prev.next;
        prev.next = temp.next;
        modCount++;
        this.size--;
        return temp.data;
    }

    public E get(int index) {
        return findByIndex(index).data;
    }

    private Node<E> findByIndex(int index) {
        checkBounds(index);
        Node<E> result = this.last.next;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result;
    }

    private void checkBounds(int index) {
        if ((index < 0) && (index >= this.size)) {
            throw new IndexOutOfBoundsException();
        }
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
