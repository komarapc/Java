package com.app.customer;

import com.app.barang.Barang;

public class Customer {
    public String name, address;
    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void show() {
        System.out.println("\n");
        System.out.println("=== Customer ===");
        System.out.println("Name\t: " + this.name);
        System.out.println("Address\t: " + this.address);
    }

    public void buy(Barang barang, int quantity) {
        barang.boughtItem(this, barang, quantity);
    }

    public static void main(String[] args) {
        Customer customer = new Customer("Komar", "Palembang");
        Barang barang = new Barang("Keyboard", 40, 200000);
        barang.show();
        customer.show();
        customer.buy(barang, 12);
    }
}
