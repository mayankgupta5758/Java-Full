package com.mayank.syntax;

import java.util.Scanner;

public class RideOrNot {
	public static void checkTheRideForUser(int height, int age, boolean wantPhotos) {
		int money = 0;
		if (height > 120) {
			if (age < 12) {
				money = 5;
			} else if (age >= 12 && age < 18) {
				money = 7;
			} else if (age >= 18 && age < 45) {
				money = 12;
			} else if (age >= 45 && age < 55) {
				money = 0;
			} else {
				System.out.println("You are old enough. ");
			}

			if (wantPhotos) {
				System.out.println("Your total amount is " + (money + 3));
			} else {
				System.out.println("Your total amount is " + (money));
			}
		} else {
			System.out.println("You can't ride.");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height(in cm): ");
		int height = scanner.nextInt();

		System.out.println("Enter the age: ");
		int age = scanner.nextInt();

		System.out.println("You want photos true or false");
		boolean wantPhotos = scanner.nextBoolean();

		checkTheRideForUser(height, age, wantPhotos);
		scanner.close();
	}
}
