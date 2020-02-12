package com.app.barang;

import com.app.customer.Customer;

public class Barang {

    String name;
    int stock;
    double price;

    public Barang(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public void boughtItem(Customer customer, Barang barang, int quantity) {
        System.out.println("\n");
        System.out.println("--- Buy ---");

        if(!checkAvaliableStock(barang, quantity)) {
            System.out.println("maximum stock " + barang.stock);
        } else {
            double subtotal = countSubtotal(quantity, barang.price);
            System.out.println(customer.name + " Buy " + barang.name);
            System.out.println("Quantity\t: " + quantity + " of " + barang.stock);
            System.out.println("Item Price\t: " + barang.price);
            System.out.println("Subtotal\t: " + subtotal);
            reduceStock(barang, quantity);
            barang.show();
        }
    }

    private double countSubtotal(int quantity, double price) {
        return  quantity * price;
    }

    private void reduceStock(Barang barang, int quantity){
        barang.stock = barang.stock - quantity;
    }

    private boolean checkAvaliableStock(Barang barang, int quantity) {
        return quantity < barang.stock;
    }

    public void show() {
        System.out.println("\n");
        System.out.println("=== Item ===");
        System.out.println("Item Name\t: " + this.name);
        System.out.println("Item Stock\t: " + this.stock);
        System.out.println("Item Price\t: " + this.price);
    }
}
