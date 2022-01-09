package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ListOfProducts listOfProducts = new ListOfProducts();
        boolean exit = false;
        while (true) {
            ListOfProducts[] listOfProducts1 = listOfProducts.addNameProducts();
            for (int i = 0; i < listOfProducts1.length; i++) {
                System.out.println("id san pham " + (i + 1) + " la :"
                        + listOfProducts1[i].getId()
                        + " ten sp :" + listOfProducts1[i].getName()
                        + " gia sp :" + listOfProducts1[i].getPrice()
                        + " mo ta sp :" + listOfProducts1[i].getDescription()
                );
            }
            System.out.println("Nhap 1 de thoat. nhâp bat ky de tiep tuc");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            exit = number == 1;
            if (exit) {
                break;
            }
        }
    }
}
