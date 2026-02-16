package com.mayank.arrayassign;

import java.util.Scanner;

public class FraudTransactionDetector {

	public static void main(String[] args) {
		
//		n = 10
//		transactions = [12000, 55000, 60000, 45000, 30000,
//		                80000, 20000, 75000, 76000, 10000]


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        double[] transactions = new double[n];

        System.out.println("Enter daily transaction amounts:");

        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextDouble();
        }

        double total = 0;
        boolean fraudDetected = false;


        for (int i = 0; i < n; i++) {

            total += transactions[i];

            if (transactions[i] > 50000) {
                System.out.println("Transaction at index " + i + " is Suspicious");
            }

            if (i > 0) {
                if (transactions[i] > 50000 &&
                    transactions[i - 1] > 50000) {

                    fraudDetected = true;
                }
            }
        }

        double average = total / n;

        System.out.println("Average Transaction Value: " + average);

        if (fraudDetected) {
            System.out.println("Potential Fraud Detected");
        } else {
            System.out.println("No Fraud Pattern Detected");
        }

        if (average > 40000) {
            System.out.println("High Value Account");
        }
        scanner.close();
    }
}
