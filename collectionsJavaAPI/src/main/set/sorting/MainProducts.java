package main.set.sorting;

public class MainProducts {

    public static void main(String[] args) {
        ProductRegistration products = new ProductRegistration();

        products.addProduct(1L, "Product 05", 15d, 5);
        products.addProduct(1L, "Product 02", 2d, 15);
        products.addProduct(3L, "Product 14", 20d, 8);
        products.addProduct(5L, "Product 1", 4d, 2);

        System.out.println(products.showProductsByName());
        System.out.println(products.showByPrice());
    }
}