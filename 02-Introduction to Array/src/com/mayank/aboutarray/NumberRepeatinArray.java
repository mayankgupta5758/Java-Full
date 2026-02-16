package com.mayank.aboutarray;

import java.util.Scanner;

public class NumberRepeatinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("Enter the number to check the occurence: ");
			int number = scanner.nextInt();
			int count = 0;
			
			for(int i: arr) {
				 count = i == number? count+1:count;
			}
			System.out.println("The number occur " + count + " times");
		} else {
			System.out.println("Enter a positive number.");
		}
		scanner.close();
	}

}
