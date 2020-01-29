package collections.model;

import java.util.Collection;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    private int age;

    public Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    @Override
    public int compareTo(Student student) {
        return this.lastName.compareToIgnoreCase(student.lastName);
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;

        public Builder(String firstName) {
            this.firstName = firstName;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " " + this.age;
    }

    static public void print(Collection<Student> c) {
        for (Student temp : c) {
            System.out.println(temp);
        }
    }
}
