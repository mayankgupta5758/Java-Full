package com.mayank.aboutarray;

import java.util.Scanner;

public class FindingPeakElementinArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array: ");
		int size = scanner.nextInt();
		
		if (size > 0) {
			
			int[] arr = new int[size];
			
			System.out.println("Enter the values:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print("arr[" + i + "] = ");
				arr[i] = scanner.nextInt();
			}
			
			if (size >= 3) {
				
				int peakElementIndex = -1;
				
				for (int i = 1; i < arr.length - 1; i++) {
					
					if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
						peakElementIndex = i;
						break; 
					}
				}
				
				if (peakElementIndex != -1) {
					System.out.println("Peak Element Found at Index: " + peakElementIndex);
					System.out.println("Peak Element Value: " + arr[peakElementIndex]);
				} else {
					System.out.println("No Peak Element Found.");
				}
				
			} else {
				System.out.println("Array size should be at least 3 to find peak element.");
			}
		} else {
			System.out.println("Invalid array size.");
		}
		
		scanner.close();
	}
}
