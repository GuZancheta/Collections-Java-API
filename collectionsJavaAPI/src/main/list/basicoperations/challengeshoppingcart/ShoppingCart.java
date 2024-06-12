package main.list.basicoperations.challengeshoppingcart;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCart {

    private List<Item> itemList = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        itemList.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        itemList.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public double calculateTotalPrice() {
        AtomicReference<Double> totalPrice = new AtomicReference<>((double) 0);
        itemList.forEach(item -> {
            double priceTotalItem = item.getPrice() * item.getQuantity();
            totalPrice.updateAndGet(v -> (v + priceTotalItem));
        });
        return totalPrice.get();
    }

    public void displayItems() {
        System.out.println(itemList);
    }
}
