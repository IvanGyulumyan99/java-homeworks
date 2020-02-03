package map_homework.util;

import map_homework.model.Faculties;
import map_homework.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListUtils {

    public static HashMap getCountOfStudentsOccurrences(ArrayList<Student> studentsList) {
        HashMap<Student, Integer> tempMap = new HashMap<>();
        for (Student student : studentsList) {
            if (tempMap.containsKey(student)) {
                tempMap.put(student, tempMap.get(student) + 1);
            } else {
                tempMap.put(student, 1);
            }
        }
        return tempMap;
    }

    public static HashMap getCountOfStudentsInFaculties(ArrayList<Student> studentsList) {
        HashMap<Faculties, Integer> tempMap = new HashMap<>();
        for (Student student : studentsList) {
            Integer countOfStudentsInFaculties = tempMap.get(student.getFaculty());
            if (countOfStudentsInFaculties == null) {
                tempMap.put(student.getFaculty(), 1);
            } else {
                tempMap.put(student.getFaculty(), countOfStudentsInFaculties + 1);
            }
        }
        return tempMap;
    }

    public static void printSameStudentsOccurrencesMap(HashMap<Student, Integer> map) {
        for (Map.Entry<Student, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }

    public static void printFacultyMembersQuantityMap(HashMap<Faculties, Integer> map) {
        for (Map.Entry<Faculties, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
    }

}




