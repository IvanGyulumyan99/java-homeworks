package collections.main;

import collections.comparator.CompareStudentNameAscendingAndAgeDescending;
import collections.model.*;
import collections.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;

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
        Student narek22 = new Student("Narek", "Asatryan", 22);
        Student narek20 = new Student("Narek", "Asatryan", 20);
        Student ivan18 = new Student("Ivan", "Gyulumyan", 18);

        StoredStudents temp = new StoredStudents();
        temp.initDynamicArray(ivan, anna, narek, arthur);
        temp.initLinkedList(anna, narek, ivan, hakob);

//        presenting Linked List work
//        doublyLinkedList.push(narek);
//        doublyLinkedList.addLast(ivan);
//        doublyLinkedList.print();
//        doublyLinkedList.pop();
//        doublyLinkedList.print();
//        doublyLinkedList.removeLast();
//        doublyLinkedList.print();

//        presenting comparator work
//        ArrayList<Student> arrayList = new ArrayList<Student>();
//        arrayList.add(anna);
//        arrayList.add(ivan);
//        arrayList.add(hakob);
//        arrayList.add(narek20);
//        arrayList.add(narek);
//        arrayList.add(arthur);
//        arrayList.add(narek22);
//        arrayList.add(ivan18);
//        CompareStudentNameAscendingAndAgeDescending cmp = new CompareStudentNameAscendingAndAgeDescending();
//        arrayList.sort(cmp);
//        for (Student tmp : arrayList) {
//            System.out.println(tmp);
//        }

    }
}
