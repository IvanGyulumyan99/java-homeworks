package collections.comparator;

import collections.model.Student;

import java.util.Comparator;

public class StudentNameAscendingAndAgeDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int nameCompare = student1.getFirstName().compareTo(student2.getFirstName());

        if (nameCompare == 0) {
            return student2.getAge() - student1.getAge();
        }
        return nameCompare;
    }
}
