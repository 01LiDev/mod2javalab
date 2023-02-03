/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.jldevelops.Mod2LabJava;

import java.util.Scanner;

/**
 *
 * @author Johnson
 */
public class Mod2LabJava {

    public static void main(String[] args) {
        //3.12
        Scanner input = new Scanner(System.in);
        Invoice invoice = new Invoice("", "", 0, 0.0);

        System.out.print("Enter part number: ");
        invoice.setNumber(input.nextLine());

        System.out.print("Enter part description: ");
        invoice.setDescription(input.nextLine());

        System.out.print("Enter quantity: ");
        invoice.setQuantity(input.nextInt());

        System.out.print("Enter price per item: ");
        invoice.setPricePerItem(input.nextDouble());

        System.out.println("Part Number: " + invoice.getNumber());
        System.out.println("Part Description: " + invoice.getDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
        //3.14
        Date date = new Date(2, 3, 2022);
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
        date.displayDate();
        //4.22
        System.out.println("N\t10*N\t100*N\t1000*N");// \t are tab characters which makes it aligned into columns
        for (int i = 1; i <= 5; i++) {//loops 5 times with i incremented by 1 which prints out the following table as the instructions followed
            System.out.println(i + "\t" + i * 10 + "\t" + i * 100 + "\t" + i * 1000);
        }
        //5.17
        int productNum;
        int quantity;
        double total = 0;

        while (true) {//loops starts
            System.out.print("Enter the product number (1-5) or 0 to exit: ");
            productNum = input.nextInt();
            if (productNum == 0) {//exits the loop if 0 is entered
                break;
            }

            System.out.print("Enter the quantity sold: ");
            quantity = input.nextInt();

            double price;
            switch (productNum) {//switch case using lambda expression "->" adds a cleaner look
                case 1 -> price = 2.98;
                case 2 -> price = 4.50;
                case 3 -> price = 9.98;
                case 4 -> price = 4.49;
                case 5 -> price = 6.87;
                default -> {
                    System.out.println("Product does not exist!");
                    continue;
                }
            }

            total += price * quantity;
        }

        System.out.println("Total Price: $" + total);
    }

}
