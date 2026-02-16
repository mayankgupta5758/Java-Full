package com.mayank.multidimensionarray;

import java.util.Scanner;

public class PrintTwoDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = 0, cols = 0;

		System.out.print("Enter number of rows: ");
		rows = scanner.nextInt();
		if (rows > 0) {
			System.out.println("Number of rows must be positive.");
			System.out.print("Enter number of columns: ");
			cols = scanner.nextInt();
			if (cols > 0) {
				System.out.println("Number of columns must be positive.");
				int[][] arr = new int[rows][cols];

				System.out.println("Enter " + (rows * cols) + " integers:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						arr[i][j] = scanner.nextInt();
					}
				}

				System.out.println("The 2D array is:");
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		}

		scanner.close();
	}

}
