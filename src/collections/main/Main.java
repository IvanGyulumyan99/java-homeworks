package collections.main;

import collections.comparator.CompareStudentAgeDescendingComparator;
import collections.comparator.CompareStudentNameAscendingComparator;
import collections.model.*;
import collections.student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //Builder design pattern example
        Student ivan = new Student.Builder("Ivan")
                .setLastName("Gyulumyan")
                .setAge(20)
                .build();

        CompareStudentAgeDescendingComparator descendingAge = new CompareStudentAgeDescendingComparator();
        CompareStudentNameAscendingComparator ascendingFirstName = new CompareStudentNameAscendingComparator();

        Student anna = new Student("Anna", "Martirosyan", 18);
        Student hakob = new Student("Hakob", "Petrosyan", 23);
        Student arthur = new Student("Arthur", "Grigoryan", 22);
        Student narek = new Student("Narek", "Asatryan", 21);

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(arthur);
        dynamicArray.add(ivan);
        dynamicArray.add(anna);
        dynamicArray.add(hakob);
        dynamicArray.add(narek);
        System.out.println("Dynamic Array: ");
        DynamicArray.print(dynamicArray);
        dynamicArray.remove(ivan);
        System.out.println("\nDynamic Array with deleted student: ");
        DynamicArray.print(dynamicArray);

        System.out.println("\nLinked List: ");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(arthur);
        doublyLinkedList.addLast(ivan);
        doublyLinkedList.addLast(anna);
        doublyLinkedList.addLast(hakob);
        doublyLinkedList.addLast(narek);
        doublyLinkedList.printForward();

        ArrayList<Student> arrayListOfStudents = new ArrayList<Student>();
        arrayListOfStudents.add(anna);
        arrayListOfStudents.add(ivan);
        arrayListOfStudents.add(hakob);
        arrayListOfStudents.add(arthur);

        LinkedList<Student> linkedListOfStudents = new LinkedList<Student>();
        linkedListOfStudents.add(anna);
        linkedListOfStudents.add(ivan);
        linkedListOfStudents.add(hakob);
        linkedListOfStudents.add(arthur);
        linkedListOfStudents.add(narek);

        System.out.println("\nList of students");
        Student.print(arrayListOfStudents);

        arrayListOfStudents.sort(descendingAge);
        System.out.println("\nList of students after sorting by descending age");
        Student.print(arrayListOfStudents);

        System.out.println("\nList of students after sorting by ascending firstname");
        arrayListOfStudents.sort(ascendingFirstName);
        Student.print(arrayListOfStudents);

        System.out.println("\nList of students after sorting by ascending lastname");
        Collections.sort(linkedListOfStudents);
        Student.print(linkedListOfStudents);



    }
}
