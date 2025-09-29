package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner POS = new Scanner(System.in); // Scanner needed to read user input

        System.out.println("Select your sandwich size: 1 or 2"); // Asking user to select a sandwich size
        double sandwichSize = POS.nextDouble(); // initializing variable that will hold user input

        double total = 0; // initializing total

        //if- else for sandwichSize
        if (sandwichSize == 1){
            System.out.println("You have selected a regular sandwich priced ar $5.45");
        }
        else if (sandwichSize == 2){
            System.out.println("You have selected a large sandwich priced at $8.95");
        }
        else {
            System.out.println("Invalid option: try again");
        }

        System.out.println("What is your age?"); // Asking user to input age
        int age = POS.nextInt(); // initializing age variable to hold user input

        double basePrice = 0; // initializing variable named basePrice for when discounts don't apply
        // Ifs statements for basePrice
        if (sandwichSize == 1) { basePrice = 5.45;}
        if (sandwichSize == 2) { basePrice = 8.95;}

        // if-else statements to calculate the total after applying discount
        if (17 >= age & sandwichSize == 1) {
            total = (basePrice * 0.10) * 10;
            System.out.println("You get a 10% discount. Your total is " + total);
        }
        else if (65 <= age & sandwichSize == 1){
            total = (basePrice * 0.20) * 10;
                System.out.println("You get a 20% discount. Your total is " + total);
        } else if (17 >= age && sandwichSize == 2) {
            total = (basePrice * 0.010) * 100;
            System.out.println("You get a 10% discount. Your total is " + total);
        } else if (65 <= age && sandwichSize == 2) {
            total = (basePrice * 0.010) * 100;
            System.out.println("You get a 20% discount. Your total is " + total);
        }
        else{
            System.out.println("Your total is " + basePrice);
        }
    }

    }
