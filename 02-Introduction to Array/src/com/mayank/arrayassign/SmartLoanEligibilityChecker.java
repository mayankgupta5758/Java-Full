package com.mayank.arrayassign;

import java.util.Scanner;

public class SmartLoanEligibilityChecker {

	public static void main(String[] args) {

//		        n = 5
//				creditScores = [820, 750, 590, 810, 720]
//				monthlyIncomes = [120000, 50000, 40000, 90000, 20000]
//				existingLoans = [1, 0, 2, 3, 1]

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of applicants: ");
		int n = scanner.nextInt();

		int[] creditScores = new int[n];
		int[] monthlyIncomes = new int[n];
		int[] existingLoans = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Credit Score: ");
			creditScores[i] = scanner.nextInt();

			System.out.print("Monthly Income: ");
			monthlyIncomes[i] = scanner.nextInt();

			System.out.print("Existing Loans: ");
			existingLoans[i] = scanner.nextInt();
		}

		int approvals = 0;
		int rejections = 0;

		int bestApplicantIndex = -1;
		int bestCreditScore = 0;

		for (int i = 0; i < n; i++) {

			if (creditScores[i] < 600 || monthlyIncomes[i] < 25000 || existingLoans[i] >= 3) {

				System.out.println("Applicant " + i + "  Rejected");
				rejections++;
			} else {

				approvals++;

				if (creditScores[i] >= 800 && monthlyIncomes[i] > 100000) {

					System.out.println("Applicant " + i + "  Instant Approval");
				} else {
					System.out.println("Applicant " + i + "  Standard Review");
				}

				if (creditScores[i] > bestCreditScore) {
					bestCreditScore = creditScores[i];
					bestApplicantIndex = i;
				}
			}
		}

		System.out.println("Total Approvals: " + approvals);
		System.out.println("Total Rejections: " + rejections);

		if (bestApplicantIndex != -1) {
			System.out.println("Best Approval Profile Applicant Index: " + bestApplicantIndex);
		} else {
			System.out.println("No Approved Applicants");
		}
		scanner.close();
	}
}
