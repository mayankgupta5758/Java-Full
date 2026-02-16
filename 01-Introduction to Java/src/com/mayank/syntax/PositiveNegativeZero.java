package com.mayank.syntax;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for check it is Positive, Negative or Zero: ");
		int number = scanner.nextInt();
		
		if(number == 0) {
			System.out.println("Your Number " + number + " is Zero.");
		} else if(number > 0) {
			System.out.println("Your Number is " + number + " is Positive.");
		}else {
			System.out.println("Your Number is " + number + " is Negative.");
		}
		scanner.close();
	}
}
