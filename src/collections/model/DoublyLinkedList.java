package collections.model;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node tail;
    private Node head;
    private int size;

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
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
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
        System.out.println(temp + " is deleted from the head of List \n");
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
        System.out.println(temp + " is deleted from the tail of List \n");
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
}
