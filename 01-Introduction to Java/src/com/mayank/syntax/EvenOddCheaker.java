package com.mayank.syntax;

import java.util.Scanner;

public class EvenOddCheaker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for check it is Even Or Odd");
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Your Number " +number + " is a Even");
		}else {
			System.out.println("Your Number " +number + " is a Odd");
		}
		scanner.close();
	}
}
