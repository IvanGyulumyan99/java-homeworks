package set;
//todo remove, docs and print
public class Main {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Gyulumyan", 20);
        Student anna = new Student("Anna", "Martirosyan", 18);
        Tree<Student> tree = new Tree<Student>();
        tree.add(anna);
        tree.add(null);
        System.out.println(tree.contains(null));
    }
}
