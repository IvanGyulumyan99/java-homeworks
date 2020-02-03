package map_homework.model;

import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;
    private Faculties faculty;

    public Student(String firstName, String lastName, int age, String phoneNumber, Faculties faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return firstName.equals(student.firstName) && lastName.equals(student.lastName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}


