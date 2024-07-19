package main.set.sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> productSet = new HashSet<>();

    public void addProduct(long code, String name, double price, int quantity) {
        productSet.add(new Product(code, name, price, quantity));
    }

    public Set<Product> showProductsByName() {
        return new TreeSet<>(productSet);
    }

    public Set<Product> showByPrice() {
        Set<Product> productByPrice = new TreeSet<>(new ComparatorByPrice());
        productByPrice.addAll(productSet);
        return productByPrice;
    }
}