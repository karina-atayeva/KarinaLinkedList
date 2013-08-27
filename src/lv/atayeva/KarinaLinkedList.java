package lv.atayeva;

import java.util.Iterator;

public class KarinaLinkedList<T> implements CTCoList<T> {

    private Node head;
    private int size;

    @Override
    public void add(T value) {
        Node NodeToAdd = new Node(value);
        Node current = head;

        if (this.head == null) {
            this.head = NodeToAdd;
            size++;
        } else {
            while (current.getNext() != null)
                current = current.getNext();
            current.setNext(NodeToAdd);
            this.size++;
        }
    }

    @Override
    public T get(int i) {
        if (size < 1) {
            throw new IndexOutOfBoundsException();
        }
        try {
            Node current;
            if (i == 0)
                current = head;
            else {
                current = head.getNext();
            }

            for (int j = 1; j < i; j++) {
                current = current.getNext();
            }
            return current.getValue();
        } catch (NullPointerException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void clear() {
        for (int j = 1; j <= size; j++)
            remove(j);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(int i) {
        if (i < 0 || i > size())
            return false;
        Node current = head;
        for (int j = 1; j < i; j++) {
            if (current.getNext() == null)
                return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                if (current == null)
                    return false;
                else
                    return true;
            }

            @Override
            public T next() {
                if (!hasNext())
                    return null;
                else {
                    T tmpValue = current.getValue();
                    current = current.getNext();
                    return tmpValue;
                }
            }

            @Override
            public void remove() {
            }
        };
        return iterator;
    }

    class Node {
        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        public T getValue() {
            return this.value;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
