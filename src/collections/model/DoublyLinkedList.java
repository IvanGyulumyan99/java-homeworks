package collections.model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
    private int size;
    private DoublyLinkedListIterator iterator;

    public DoublyLinkedList() {
        iterator = new DoublyLinkedListIterator(head);
    }

    public DoublyLinkedListIterator getIterator() {
        return new DoublyLinkedListIterator(head);
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
            newNode.prev = tail;
        }
        tail = newNode;
        size++;
    }

    public void print() {
        DoublyLinkedListIterator iterator = getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public Node pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        size--;
        System.out.println(temp + " has been deleted from the head of List \n");
        return temp;
    }

    public Node removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        size--;
        System.out.println(temp + " has been deleted from the tail of List \n");
        return temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
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

    public class DoublyLinkedListIterator implements Iterator<Student> {

        private Node next;

        public DoublyLinkedListIterator(Node head) {
            this.next = head;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Student next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Student student = next.data;
            next = next.next;
            return student;
        }
    }
}

