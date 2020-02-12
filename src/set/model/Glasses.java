package set.model;

import java.util.Objects;

public class Glasses implements Comparable<Glasses> {
    private String brandName;
    private double price;
    private String color;

    public Glasses(String brandName, double price, String color) {
        this.brandName = brandName;
        this.price = price;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Glasses glasses = (Glasses) o;
        return Double.compare(glasses.price, price) == 0 &&
                Objects.equals(brandName, glasses.brandName) &&
                Objects.equals(color, glasses.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, price, color);
    }

    @Override
    public int compareTo(Glasses glasses) {
        return (int) ((this.price) * 100 - (glasses.getPrice() * 100));
    }

    @Override
    public String toString() {
        return brandName + " " + price + "$ " + color;
    }
}
