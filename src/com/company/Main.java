package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        while (1 == 1) {
            Double VAT = 1.20;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter price:");
            Double price = input.nextDouble();
            price = price * VAT;
            price = Math.round(price * 10.00) / 10.00;
            System.out.println("Your price + VAT is £" + price);
        }
    }
}
