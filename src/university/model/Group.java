package university.model;

import university.model.exceptions.NoGroupStudentsException;
import university.model.util.ArrayUtils;

public class Group {

    private int number;

    private Student[] students;

    private Subject[] subjects;

    public Group(int number, Student[] students, Subject[] subjects) {
        validate(students);
        this.students = students;
        this.number = number;
        this.subjects = subjects;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getNumber() {
        return number;
    }

    public Subject[] getSubjects() {
        return subjects;
    }


    public double getAvgForSubject(Subject subject) {
        double sum = 0d;
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            StudentMark[] studentMarks = students[i].getMarks();
            for (int j = 0; j < studentMarks.length; j++) {
                if (studentMarks[j].getSubject().equals(subject)) {
                    count++;
                    sum += studentMarks[j].getMark().getValue();
                }
            }
        }
        if(count == 0) {
            return 0;
        }
        return sum / count;
    }

    private void validate(Student[] students) {
        if (ArrayUtils.isEmptyArray(students)) {
            throw new NoGroupStudentsException();
        }
    }

}
