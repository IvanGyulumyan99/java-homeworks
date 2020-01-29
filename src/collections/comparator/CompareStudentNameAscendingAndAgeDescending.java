package collections.comparator;

import collections.model.Student;
import java.util.Comparator;

public class CompareStudentNameAscendingAndAgeDescending implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getFirstName().compareTo(student2.getFirstName())==0){
            return student2.getAge() - student1.getAge();
        }
        return student1.getFirstName().compareTo(student2.getFirstName());
    }
}
