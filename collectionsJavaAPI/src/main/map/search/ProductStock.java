package main.map.search;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class ProductStock {

    private Map<Long, Product> productStockMap = new HashMap<>();

    public void addProduct(long code, String name, double price, int quantity) {
        productStockMap.put(code, new Product(name, price, quantity));
    }

    public void showProducts() {
        System.out.println(productStockMap);
    }

    public double calculateTotalStockValue() {
        AtomicReference<Double> totalStockValue = new AtomicReference<>((double) 0);
        if (!productStockMap.isEmpty()) {
            productStockMap.values().forEach(product -> totalStockValue.updateAndGet(v -> v + product.getQuantity() * product.getPrice()));
        }
        return totalStockValue.get();
    }

    public Product getMoreExpensiveProduct() {
        final Product[] expensiveProduct = {null};
        final double[] moreExpencivePrice = {Double.MIN_VALUE};

        productStockMap.values().forEach(product -> {
            if (product.getPrice() > moreExpencivePrice[0]) {
                expensiveProduct[0] = product;
                moreExpencivePrice[0] = product.getPrice();
            }
        });

        return expensiveProduct[0];
    }

    public Product getMoreCheapProduct() {
        final Product[] expensiveProduct = {null};
        final double[] moreExpencivePrice = {Double.MAX_VALUE};

        productStockMap.values().forEach(product -> {
            if (product.getPrice() < moreExpencivePrice[0]) {
                expensiveProduct[0] = product;
                moreExpencivePrice[0] = product.getPrice();
            }
        });

        return expensiveProduct[0];
    }

    public Product getMoreExpensivePriceAndQuantityProduct() {
        final Product[] expensiveProduct = {null};
        final double[] moreExpencivePrice = {Double.MIN_VALUE};

        productStockMap.values().forEach(product -> {
            if (product.getPrice() * product.getQuantity() > moreExpencivePrice[0]) {
                expensiveProduct[0] = product;
                moreExpencivePrice[0] = product.getPrice() * product.getQuantity();
            }
        });

        return expensiveProduct[0];
    }
}