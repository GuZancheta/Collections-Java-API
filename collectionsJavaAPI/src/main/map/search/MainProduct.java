package main.map.search;

public class MainProduct {

    public static void main(String[] args) {
        ProductStock stock = new ProductStock();
        stock.showProducts();

        stock.addProduct(1L, "Product A", 5.0, 10);
        stock.addProduct(2L, "Product B", 10.0, 5);
        stock.addProduct(3L, "Product C", 15.0, 2);
        stock.addProduct(4L, "Product D", 7.0, 9);

        stock.showProducts();

        System.out.println("Total stock value: " + stock.calculateTotalStockValue());
        System.out.println("-------------");

        System.out.println("More expensive product: " + stock.getMoreExpensiveProduct());
        System.out.println("More cheap product: " + stock.getMoreCheapProduct());

        System.out.println("More expensive at all: " + stock.getMoreExpensivePriceAndQuantityProduct());
    }
}
