package university.model;

import university.model.exceptions.NoDepartmentException;
import university.model.util.ArrayUtils;

public class University {

    private final String name;

    private Department[] departments;

    public University(final String name, final Department[] departments) {
        validate(departments);
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public double getAvgForSubject(Subject subject) {
        double sum = 0d;
        int counter = 0;
        for (int m = 0; m < departments.length; m++) {
            Group[] groups = departments[m].getGroups();
            for (int i = 0; i < groups.length; i++) {
                Student[] groupStudents = groups[i].getStudents();
                for (int j = 0; j < groupStudents.length; j++) {
                    StudentMark[] studentMarks = groupStudents[j].getMarks();
                    for (int k = 0; k < studentMarks.length; k++) {
                        if (studentMarks[k].getSubject().equals(subject)) {
                            sum += studentMarks[k].getMark().getValue();
                            counter++;
                        }
                    }
                }
            }
        }
        if (counter == 0) {
            return counter;
        }
        return sum / counter;
    }

    private void validate(Department[] departments) {
        if (ArrayUtils.isEmptyArray(departments)) {
            throw new NoDepartmentException();
        }
    }

}
