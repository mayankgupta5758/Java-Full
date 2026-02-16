package com.mayank.aboutarray;

import java.util.Scanner;

public class SecondMaximuninArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an Array: ");
		int size = scanner.nextInt();

		if (size > 1) {
			int[] arr = new int[size];
			System.out.println("Enter the value: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.println("arr[" + i + "] = ");
				arr[i] = scanner.nextInt();
				;
			}
			int max = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					secondMax = max; 
					max = arr[i]; 
				} else if (arr[i] > secondMax && arr[i] != max) {
					secondMax = arr[i];
				}
			}
			System.out.println("The second Maximun in array is: " + secondMax);
		} else {
			System.out.println("Enter a positive number.");
		}
		scanner.close();

	}

}
