package com.mayank.aboutarray;

import java.util.Scanner;

public class MaximumnumberofOneinArray {

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
			int count = 0;
	        int max = 0;

	        for(int i = 0; i < arr.length; i++) {

	            if(arr[i] == 1) {
	                count++;
	                max = Math.max(max, count);
	            } else {
	                count = 0;
	            }
	        }

	        System.out.println("Maximum consecutive 1s: " + max);
		}
		scanner.close();
	}

}
