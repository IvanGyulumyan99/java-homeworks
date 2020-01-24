package collections.model;

import java.util.Arrays;

public class DynamicArray {
    private static final int INITIAL_CAPACITY = 10;
    private Student[] data;
    private int size;

    public DynamicArray() {
        data = new Student[INITIAL_CAPACITY];
        size = 0;
    }

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            data = new Student[capacity];
            size = 0;
        }
    }

    public boolean add(Student student) {
        ensureCapacity();
        data[size++] = student;
        return true;
    }

    public boolean remove(Student s) {
        Student[] es = this.data;
        int size = this.size;
        int i = 0;
        if (s == null) {
            while (true) {
                if (i >= size) {
                    return false;
                }
                if (es[i] == null) {
                    break;
                }
                ++i;
            }
        } else {
            while (true) {
                if (i >= size) {
                    return false;
                }
                if (s.equals(es[i])) {
                    break;
                }
                ++i;
            }
        }

        this.fastRemove(es, i);
        return true;
    }

    private void fastRemove(Student[] es, int i) {
        int newSize;
        if ((newSize = this.size - 1) > i) {
            System.arraycopy(es, i + 1, es, i, newSize - i);
        }
        es[this.size = newSize] = null;
    }

    public int size() {
        return size;
    }

    public Student get(int index) {
        checkRange(index);
        return data[index];
    }

    public void ensureCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
    }

    private void checkRange(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void print() {
        System.out.println("Dynamic array: ");
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.get(i));
        }
    }
}
