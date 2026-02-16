package com.mayank.aboutarray;

import java.util.Scanner;

public class ShiftingCharacterbyKPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scanner.nextLine();
		System.out.println("Enter the postion for shifting: ");
		int k = scanner.nextInt();

		int n = str.length();
		k = k % n;

		String resultLeftShift = str.substring(k) + str.substring(0, k);
		System.out.println("Left Shift: " + resultLeftShift);
		String resultRightShift = str.substring(n - k) + str.substring(0, n - k);
		System.out.println("Right Shift: " + resultRightShift);
		scanner.close();
	}
}
