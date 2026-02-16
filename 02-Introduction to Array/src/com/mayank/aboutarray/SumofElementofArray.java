package com.mayank.aboutarray;

import java.util.Scanner;

public class SumofElementofArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of an Array: ");
	int size = scanner.nextInt();
	
	if(size > 0) {
		int[] arr = new int[size];
		System.out.println("Enter the value: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i +"] = " );
			arr[i] = scanner.nextInt();
		}
		int sum = 0;
		for(int i: arr) {
			 sum += i;
		}
		System.out.println("The sum of an array is: " + sum);
	} else {
		System.out.println("Enter a positive number.");
	}
	scanner.close();
}
}
