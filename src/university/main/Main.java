package university.main;


import university.model.*;

public class Main {

    public static Subject subject1 = new Subject("subject1");
    public static Subject subject2 = new Subject("subject2");
    public static Subject subject3 = new Subject("subject3");
    public static Subject subject4 = new Subject("subject4");
    public static Subject subject5 = new Subject("subject5");

    public static Student john = new Student("john", "smith");
    public static Student alex = new Student("alex", "lee");
    public static Student anna = new Student("anna", "brown");
    public static Student michael = new Student("michael", "white");


    public static void main(String[] args) {
        University university = new University("Slavonic", createDepartmentsAndGroups());

        john.applyMark(subject1, new Mark(5));
        alex.applyMark(subject1, new Mark(4));

        anna.applyMark(subject5, new Mark(7));
        anna.applyMark(subject4, new Mark(4));
        michael.applyMark(subject4, new Mark(9));

        System.out.println(university.getAvgForSubject(subject2));

        System.out.println(anna.getAvgMark());
        System.out.println(john.getAvgMark());

        System.out.println(university.getDepartments()[1].getGroups()[0].getAvgForSubject(subject4));
        System.out.println(university.getDepartments()[1].getGroups()[0].getAvgForSubject(subject5));

        System.out.println(university.getDepartments()[1].getAvgForSubject(subject4));
    }


    private static Department[] createDepartmentsAndGroups() {

        Group group1 = createGroup(506, john, alex, new Subject[]{subject1, subject2, subject3});
        Group group2 = createGroup(104, anna, michael, new Subject[]{subject4, subject5});

        Department[] departments = new Department[2];
        departments[0] = new Department("Dep1", new Group[]{group1});
        departments[1] = new Department("Dep2", new Group[]{group2});
        return departments;
    }

    private static Group createGroup(int groupNumber, Student arg1, Student arg2, Subject[] subjects) {
        return new Group(groupNumber, new Student[]{arg1, arg2}, subjects);
    }
}
