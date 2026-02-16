package com.mayank.syntax;

import java.util.Scanner;

public class WaterBillGenerator {
	public static void calculateBill(int readingConsumed) {
		int meter_charge = 75;
		int totalAmount = 0;
		if (readingConsumed > 100) {
			if (readingConsumed <= 250) {
				totalAmount = meter_charge + readingConsumed * 10;
			} else {
				totalAmount = meter_charge + readingConsumed * 20;
			}
		} else {
			totalAmount = meter_charge + readingConsumed * 5;
		}
		System.out.println("Your Total Amount of Water is: " + totalAmount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the unit Consumed: ");
		int readingConsumed = scanner.nextInt();
		calculateBill(readingConsumed);
		scanner.close();
	}
}
