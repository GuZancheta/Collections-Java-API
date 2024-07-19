package main.set.sorting;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private long code;
    private String name;
    private double price;
    private int quantity;

    public Product(long code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Product product)) return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "code=" + code + ", name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ';';
    }

    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }
}