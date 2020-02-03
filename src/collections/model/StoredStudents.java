package collections.model;

public class StoredStudents {
    public static DynamicArray dynamicArrayOfStudents = new DynamicArray();
    public static DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

    public void initDynamicArray(Student... students) {
        for (int i = 0; i < students.length; i++) {
            dynamicArrayOfStudents.add(students[i]);
        }
    }

    public void initLinkedList(Student... students) {
        for (int i = 0; i < students.length; i++) {
            doublyLinkedList.addLast(students[i]);
        }
    }

}