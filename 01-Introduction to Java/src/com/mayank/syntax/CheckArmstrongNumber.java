package com.mayank.syntax;

import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for check it is Armstrong Number or Not");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;  
            sum += (int)Math.pow(digit, digits);
            number = number / 10; 
        }

        if (sum == originalNumber) {
            System.out.println("Number "+number + " Armstrong Number");
        } else {
        	System.out.println("Number "+number + " is not Armstrong Number");
        }

        scanner.close();
    }
}
