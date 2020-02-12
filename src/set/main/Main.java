package set.main;

import set.model.*;

public class Main {
    public static void main(String[] args) {
        Student vazgen = new Student.Builder("Vazgen")
                .setLastName("Petrosyan").setAge(21).build();
        Student ivan = new Student("Ivan", "Gyulumyan", 20);
        Student anna = new Student("Anna", "Martirosyan", 23);
        Student anna2 = new Student("Anna", "Martirosyan", 18);
        Student narek2 = new Student("Narek", "Asatryan", 22);

        Coffee nescafe = new Coffee("Nescafe", 6.7, 200);
        Coffee lavazza = new Coffee("Lavazza", 7.4, 100);
        Coffee jacobs = new Coffee("Jacobs", 3.2, 300);
        Coffee starbucks = new Coffee("Starbucks", 123.4, 500);

        Glasses versace = new Glasses("Versace", 234.54, "black");
        Glasses polaroid = new Glasses("Polaroid", 234.55, "blue");
        Glasses rayBan = new Glasses("Ray-Ban", 100, "white");
        Glasses prada = new Glasses("Prada", 300, "green");

        MyTreeSet<Student> studentTreeSet = new MyTreeSet<>();
        System.out.println("adding null to tree: " + studentTreeSet.add(null) + "\n");
        studentTreeSet.add(ivan);
        studentTreeSet.add(anna);
        studentTreeSet.add(anna2);
        studentTreeSet.add(narek2);
        studentTreeSet.add(vazgen);
        studentTreeSet.print();
        System.out.println("size: " + studentTreeSet.size());
        System.out.println("removing null element: " + studentTreeSet.remove(null) + "\n");
        studentTreeSet.remove(new Student("Anna", "Martirosyan", 23));
        studentTreeSet.print();
        System.out.println("contains null: " + studentTreeSet.contains(null));
        System.out.println("contains Ivan: " + studentTreeSet.contains(ivan));
        System.out.println("contains Anna(deleted): " + studentTreeSet.contains(anna) + "\n");

        MyTreeSet<Coffee> coffeeTreeSet = new MyTreeSet<>();
        coffeeTreeSet.add(nescafe);
        coffeeTreeSet.add(starbucks);
        coffeeTreeSet.add(lavazza);
        coffeeTreeSet.add(jacobs);
        coffeeTreeSet.print();

        MyTreeSet<Glasses> glassesTreeSet = new MyTreeSet<>();
        glassesTreeSet.add(rayBan);
        glassesTreeSet.add(polaroid);
        glassesTreeSet.add(versace);
        glassesTreeSet.add(prada);
        glassesTreeSet.print();

    }
}
