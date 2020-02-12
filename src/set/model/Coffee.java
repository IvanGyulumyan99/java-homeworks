package set.model;

import java.util.Objects;

public class Coffee implements Comparable<Coffee> {
    private String brandName;
    private double price;
    private int weight;

    public Coffee(String brandName, double price, int weight) {
        this.brandName = brandName;
        this.price = price;
        this.weight = weight;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Double.compare(coffee.price, price) == 0 &&
                weight == coffee.weight &&
                Objects.equals(brandName, coffee.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, price, weight);
    }

    @Override
    public int compareTo(Coffee coffee) {
        return this.brandName.compareToIgnoreCase(coffee.getBrandName());
    }

    @Override
    public String toString() {
        return brandName + " " + price + "$ " + weight + "gr";
    }
}
