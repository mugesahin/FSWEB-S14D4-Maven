package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = {
                new Chocolate("Chocolate", 5.0, "Delicious dark chocolate", "Dark"),
                new Coke("Coke", 1.5, "Refreshing beverage", 500),
                new Bread("Bread", 2.0, "Whole grain bread", "Large")
        };

        listProducts(products);
    }
}