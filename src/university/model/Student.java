package university.model;

import university.model.util.ArrayUtils;

public class Student implements Person {

    private final String firstName;

    private final String lastName;

    private StudentMark[] marks;


    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentMark[] getMarks() {
        return marks;
    }

    public double getAvgMark() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i].getMark().getValue();
        }
        return sum / marks.length;
    }

    public void applyMark(Subject subject, Mark mark) {
        mark.validate();
        if (ArrayUtils.isEmptyArray(marks)) {
            marks = new StudentMark[1];
            marks[0] = new StudentMark(subject, mark);
        } else {
            StudentMark[] tempMarks = new StudentMark[marks.length + 1];
            System.arraycopy(marks, 0, tempMarks, 0, marks.length);
            tempMarks[marks.length] = new StudentMark(subject, mark);
            marks = tempMarks;
        }
    }

}
