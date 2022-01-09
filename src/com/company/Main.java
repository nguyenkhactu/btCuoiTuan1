package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListOfProducts listOfProducts = new ListOfProducts();
        boolean exit = false;
        while (true) {
            ListOfProducts[] listOfProducts1 = listOfProducts.addNameProducts();
            for (int i = 0; i < listOfProducts1.length; i++) {
                System.out.println("id san pham "+ (i+1) + " la :" + listOfProducts1[i].getId());
                System.out.println("ten sp :" + listOfProducts1[i].getName());
                System.out.println("gia sp :" + listOfProducts1[i].getPrice());
                System.out.println("mo ta sp :" + listOfProducts1[i].getDescription());
            }
            System.out.println("Nhap 1 de thoat");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            exit = number == 1;
            if (exit) {
                break;
            }
        }
    }
}
