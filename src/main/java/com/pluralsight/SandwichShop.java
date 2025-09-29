package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner POS = new Scanner(System.in); // Scanner needed to read user input

        System.out.println("Select your sandwich size: "); // Asking user to select a sandwich size
        System.out.println("\t 1: Regular $ 5.45 ");
        System.out.println("\t 2: Large $ 8.95 ");
        
        int sandwichSize = POS.nextInt(); // initializing variable that will hold user input

        double total = 0; // initializing total

        //if- else for sandwichSize
        if (sandwichSize == 1){
            System.out.println("You have selected a regular sandwich priced ar $5.45");
            total += 5.45;
        }
        else if (sandwichSize == 2){
            System.out.println("You have selected a large sandwich priced at $8.95");
            total += 8.95;
        }
        else {
            System.out.println("Invalid option: try again");
        }

        System.out.println("Make it loaded [y/n]");   // asking user if they want a loaded sandwich
        System.out.println("loaded regular $1.00 ");
        System.out.println("loaded large $1.75;");

        String isloaded = POS.nextLine();

        if (isloaded.equalsIgnoreCase("y")) {
            if (sandwichSize == 1) {
                total += 1.00;
            }
            else if (sandwichSize == 2) {
                total += 1.75;
            }
        }
         POS.nextLine();

        System.out.println("What is your age?"); // Asking user to input age
        int age = POS.nextInt(); // initializing age variable to hold user input

        // if-else statements to calculate the total after applying discount
        if (17 >= age & sandwichSize == 1) {
            total = (total * 0.010) * 100;
            System.out.println("You get a 10% discount. Your total is " + total);
        }
        else if (65 <= age & sandwichSize == 1){
            total = (total * 0.020) * 100;
                System.out.println("You get a 20% discount. Your total is " + total);
        } else if (17 >= age && sandwichSize == 2) {
            total = (total * 0.010) * 100;
            System.out.println("You get a 10% discount. Your total is " + total);
        } else if (65 <= age && sandwichSize == 2) {
            total = (total * 0.010) * 100;
            System.out.println("You get a 20% discount. Your total is " + total);
        }
        else{
            System.out.println("Your total is " + total);
        }
    }

    }
