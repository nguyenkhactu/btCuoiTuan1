package com.company;

import java.sql.Array;
import java.util.Scanner;

public class ListOfProducts {
    private int id;
    private  String name;
    private  int price;
    private  String description;
    int countProducts = 0;
    ListOfProducts[] listOfProducts;

    public ListOfProducts() {
    }

    public ListOfProducts(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListOfProducts[] addNameProducts() {
        ListOfProducts[] listOfProducts = new ListOfProducts[this.countProducts + 1];
        if(this.listOfProducts != null) {
            for (int i = 0; i < this.listOfProducts.length; i++) {
                listOfProducts[i] = this.listOfProducts[i];
            }
        }
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhap id");
        int Idproduct = sc.nextInt();
        System.out.println("Nhap ten");
        String productName = sc1.nextLine();
        System.out.println("Nhap gia");
        int priceProduct =sc.nextInt();
        System.out.println("Mo ta san pham");
        String descriptionProduct = sc1.nextLine();
        ListOfProducts newProduct = new ListOfProducts(Idproduct, productName, priceProduct, descriptionProduct);
        listOfProducts[this.countProducts] = newProduct;
        System.out.println();
        this.countProducts++;
        this.listOfProducts = listOfProducts;
        return this.listOfProducts;
    }
}
