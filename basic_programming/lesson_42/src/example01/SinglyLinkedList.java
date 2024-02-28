package example01;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private int count;

    public SinglyLinkedList() {
        first = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int size() {
        return count;
    }

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value, first);
        first = newNode;
        count++;
    }

    public void add(T value) {
        if (isEmpty()) {
            first = new Node<>(value, null);
            count = 1;
            return;
        }

        Node<T> current = first;

        while (current.hasNext()) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value, null);
        current.setNext(newNode);
        count++;
    }

    public void add(T value, int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bounds for length " + count);
        } else if (index == 0) {
            addFirst(value);
            return;
        } else if (index == count) {
            add(value);
            return;
        }

        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        Node<T> newNode = new Node<>(value, current.getNext());
        current.setNext(newNode);
        count++;
    }

    public T get(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bounds for length " + count);
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int indexOf(T value) {
        if (isEmpty()) {
            return -1;
        }
        Node<T> current = first;

        for (int i = 0; current != null; i++) {
            if (current.getValue().equals(value)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    public boolean contains(T value) {
        return indexOf(value) != -1;
    }

    public boolean remove(T value) {
        int index = indexOf(value);
        if (index == -1) {
            return false;
        }
        return remove(index);
    }

    public boolean remove(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index out of bounds for length " + count);
        }
        Node<T> current = first;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        count--;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(first);
    }

    private class ListIterator<E> implements Iterator<E> {

        private Node<E> current;

        public ListIterator(Node<E> first) {
            this.current = first;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E value = current.getValue();
            current = current.getNext();
            return value;
        }
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        public boolean hasNext() {
            return next != null;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
