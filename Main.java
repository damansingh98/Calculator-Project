package com.codewithHarry;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       float number_1, number_2;
        System.out.println("Enter first number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("Enter second number");
        Scanner Scan2 = new Scanner(System.in);
        number_2 = Scan2.nextFloat();
        System.out.println(number_1);
        System.out.println(number_2);
        String Prompt = "Enter 0 for addition, 1 for " +
                "Subtraction, 2 for multiplication and 3 for division";
        System.out.println(Prompt);

        int input = scan.nextInt();
        switch (input){
            case 0:
                System.out.println("Adding these Numbers");
                System.out.println("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtracting these Numbers");
                System.out.println(number_1 - number_2);
                break;
            case 2 :
                System.out.println("Multiplying these Numbers ");
                System.out.println(number_1 * number_2);
                break;
            case 3 :
                System.out.println("Dividing these numbers");
                System.out.println(number_1 / number_2);
                break;

            default:
                System.out.println("Invalid Input");
        }

    }
}
