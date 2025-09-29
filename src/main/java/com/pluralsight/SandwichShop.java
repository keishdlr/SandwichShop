package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner POS = new Scanner(System.in);

        
        System.out.println("Select your sandwich size: 1 or 2");
        double sandwichSize = POS.nextDouble();

        double total = 0;
        //a. 1: Regular: base price $5.45
        //b. 2: Large: base price $8.95
        if (sandwichSize == 1){
            System.out.println("You have selected a regular sandwich priced ar $5.45");
        }
        else if (sandwichSize == 2){
            System.out.println("You have selected a large sandwich priced at $8.95");
        }
        else {
            System.out.println("Invalid option: try again");
        }

        System.out.println("What is your age?");
        int age = POS.nextInt();

        if (17 >= age & sandwichSize == 1) {
            total = (5.45 * 0.10) * 10;
            System.out.println("You get a 10% discount. Your total is " + total);
        }
        else if (65 >= age & sandwichSize == 2){
            total = (5.45 * 0.20) * 10;
                System.out.println("You get a 20% discount. Your total is " + total);
        } else if (17 >= age && sandwichSize == 1) {
            total = (8.95 * 0.10) * 10;
            System.out.println("You get a 10% discount. Your total is " + total);
        } else if (65>= age && sandwichSize == 2) {
            total = (8.95 * 0.10) * 10;
            System.out.println("You get a 20% discount. Your total is " + total);

        }
    }

    }
