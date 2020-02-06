package map_homework.main;

import map_homework.model.Faculties;
import map_homework.model.Month;
import map_homework.model.Student;
import map_homework.util.ArrayListUtils;
import map_homework.util.MonthUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Martirosyan", 18,
                "093123456", Faculties.MATH);
        Student anna2 = new Student("Anna", "Martirosyan", 23,
                "093456789", Faculties.MATH);
        Student anna3 = new Student("Anna", "Atabekyan", 23,
                "093456789", Faculties.MATH);
        Student anna4 = new Student("Anna", "Martirosyan", 26,
                "093987654", Faculties.PHYSICS);
        Student ivan = new Student("Ivan", "Gyulumyan", 20,
                "093888888", Faculties.MATH);
        Student ivan2 = new Student("Ivan", "Gyulumyan", 24,
                "093884448", Faculties.PHYSICS);
        Student narek1 = new Student("Narek", "Asatryan", 22,
                "093364657", Faculties.PHYSICS);
        Student narek2 = new Student("Narek", "Asatryan", 22,
                "093364657", Faculties.MATH);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(anna);
        studentsList.add(anna2);
        studentsList.add(anna3);
        studentsList.add(anna4);
        studentsList.add(ivan);
        studentsList.add(ivan2);
        studentsList.add(narek1);
        studentsList.add(narek2);

        HashMap<Student, Integer> firstMap = ArrayListUtils.getCountOfStudentsOccurrences(studentsList);
        ArrayListUtils.printSameStudentsOccurrencesMap(firstMap);
        HashMap<Faculties, Integer> secondMap = ArrayListUtils.getCountOfStudentsInFaculties(studentsList);
        ArrayListUtils.printFacultyMembersQuantityMap(secondMap);

        System.out.println("April holidays: " + Arrays.toString(Month.APRIL.getHolidays()));
        System.out.println("Days in march: " + Month.MARCH.getDays());
        MonthUtils.checkHoliday(Month.FEBRUARY, 32);
        System.out.println(MonthUtils.checkHoliday(Month.MARCH, 8));
        System.out.println(MonthUtils.checkHoliday(Month.MARCH, 21));
        MonthUtils.printMonthsEnum();
    }
}