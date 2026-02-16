package com.mayank.aboutarray;

import java.util.Scanner;

public class FindingMaximuninArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the size of an Array: ");
	int size = scanner.nextInt();
	
	if(size > 0) {
		int[] arr = new int[size];
		System.out.println("Enter the value: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr[" + i +"] = " );
			arr[i] = scanner.nextInt();;
		}
		int max = Integer.MIN_VALUE;
		for(int i: arr) {
			max = max < i ? i: max;
		}
		System.out.println("The maximun element in array is: " + max);
	} else {
		System.out.println("Enter a positive number.");
	}
	scanner.close();
}
}
