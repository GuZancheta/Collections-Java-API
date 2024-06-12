package main.list.basicoperations.challengeshoppingcart;

public class MainShop {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.displayItems();

        shoppingCart.addItem("Item 1", 20.2, 3);
        shoppingCart.addItem("Item 2", 10.5, 1);
        shoppingCart.addItem("Item 3", 4.82, 5);

        System.out.println("Total Price of cart: " + shoppingCart.calculateTotalPrice());
        shoppingCart.displayItems();

        shoppingCart.removeItem("Item 1");

        System.out.println("Total Price of cart: " + shoppingCart.calculateTotalPrice());
        shoppingCart.displayItems();

    }
}
