package collections.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
    private int size;
    private int index = 0;
    ListIterator it = new ListIterator();

    public DoublyLinkedList() {

    }

    public void push(Student student) {
        Node newNode = new Node(student);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(Student student) {
        Node newNode = new Node(student);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public Node pop() {
        checkEmpty();
        Node temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        size--;
        return head;
    }

    public Node removeLast() {
        checkEmpty();
        Node temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        size--;
        return head;
    }

    public void printForward() {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private void checkEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("Our list is empty, there's nothing to delete!");
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class ListIterator implements Iterator<Node> {

        public boolean hasNext() {
            return index < size;
        }

        public Node next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node temp = head;
            head = head.next;
            index++;
            return temp;
        }
    }

    private class Node {

        private Node next;
        private Node prev;
        private Student data;

        public Node(Student data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.getFirstName() + " " + data.getLastName();
        }
    }
}
