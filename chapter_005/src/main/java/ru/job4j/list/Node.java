package ru.job4j.list;

public class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
        this.value = value;
    }

    public <T> boolean hasCycle(Node<T> first) {
        Node<T> fast = first;
        Node<T> slow = first;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}