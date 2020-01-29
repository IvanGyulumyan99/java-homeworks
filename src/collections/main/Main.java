package collections.main;

import collections.model.*;
import collections.model.Student;

import static collections.model.StoredStudents.*;

public class Main {
    public static void main(String[] args) {

        Student ivan = new Student.Builder("Ivan")
                .setLastName("Gyulumyan")
                .setAge(20)
                .build();

        Student anna = new Student("Anna", "Martirosyan", 18);
        Student hakob = new Student("Hakob", "Petrosyan", 23);
        Student arthur = new Student("Arthur", "Grigoryan", 22);
        Student narek = new Student("Narek", "Asatryan", 21);

        StoredStudents temp = new StoredStudents();
        temp.initDynamicArray(ivan, anna, narek, arthur);
        temp.initLinkedList(anna, narek, ivan, hakob);
        doublyLinkedList.push(narek);
        doublyLinkedList.addLast(ivan);
        doublyLinkedList.print();
        doublyLinkedList.pop();
        doublyLinkedList.print();
        doublyLinkedList.removeLast();
        doublyLinkedList.print();

    }
}
