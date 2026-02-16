package com.mayank.syntax;

import java.util.Scanner;

public class PrimeOrNotPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check it is Prime or not:");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Not Prime");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Your Number " + number + " is a Prime Number");
            } else {
            	System.out.println("Your Number " + number + " is not a Prime Number");
            }
        }

        scanner.close();
    }
}
