package com.mayank.multidimensionarray;

import java.util.Scanner;

public class MultiplyofTwoDArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int r = sc.nextInt();

		System.out.print("Enter columns: ");
		int c = sc.nextInt();

		int A[][] = new int[r][c];
		int B[][] = new int[r][c];
		int result[][] = new int[r][c];

		System.out.println("Enter Matrix A:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Matrix B:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		System.out.println("\n1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Transpose of Matrix A");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = A[i][j] + B[i][j];
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			break;

		case 2:
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					result[i][j] = 0;
					for (int k = 0; k < c; k++) {
						result[i][j] += A[i][k] * B[k][j];
					}
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
			break;

		case 3:
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++) {
					System.out.print(A[j][i] + " ");
				}
				System.out.println();
			}
			break;

		default:
			System.out.println("Invalid Choice");
		}

		sc.close();
	}
}
