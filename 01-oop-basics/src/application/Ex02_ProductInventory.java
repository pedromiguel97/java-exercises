package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercise 02: Product Inventory Management
 *
 * Problem:
 * Create a Product class that stores:
 * - name (String)
 * - price (double)
 * - quantity (int)
 *
 * Implement methods to:
 * 1. Calculate total value in stock (price * quantity)
 * 2. Add products to inventory
 * 3. Remove products from inventory
 * 4. Display complete product information
 *
 * Create a program that demonstrates all product operations.
 */

public class Ex02_ProductInventory {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product;
        product = new Product();

        System.out.println("Enter Product Data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println(product);

        sc.close();
    }
}
