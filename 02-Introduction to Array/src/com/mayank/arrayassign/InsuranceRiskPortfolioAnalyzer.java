package com.mayank.arrayassign;

import java.util.Scanner;

public class InsuranceRiskPortfolioAnalyzer {

	public static void main(String[] args) {

//    			n = 5  
//    			ages = [22, 65, 45, 30, 19]  
//    			riskScores = [75, 60, 90, 40, 72]

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of customers: ");
		int customers = scanner.nextInt();

		int[] ages = new int[customers];
		int[] riskScores = new int[customers];

		for (int i = 0; i < customers; i++) {
			System.out.println("Enter age:");
			ages[i] = scanner.nextInt();
			System.out.println("Enter risk score (0 to 100):");

			while (true) {
				int score = scanner.nextInt();

				if (score >= 0 && score <= 100) {
					riskScores[i] = score;
					break;
				} else {
					System.out.println("Invalid Risk Score! Enter between 0 and 100:");
				}
			}
		}

		int highRiskYouth = 0;
		int seniorRisk = 0;
		int veryHighRisk = 0;
		int normalRisk = 0;

		int totalRisk = 0;

		int highestRiskIndex = 0;
		int highestRiskValue = riskScores[0];

		for (int i = 0; i < customers; i++) {

			totalRisk += riskScores[i];

			if (riskScores[i] > highestRiskValue) {
				highestRiskValue = riskScores[i];
				highestRiskIndex = i;
			}

			if (ages[i] < 25 && riskScores[i] > 70) {
				System.out.println("Customer " + i + "  High Risk Youth");
				highRiskYouth++;
			} else if (ages[i] >= 60) {
				System.out.println("Customer " + i + "  Senior Risk");
				seniorRisk++;
			} else if (riskScores[i] >= 85) {
				System.out.println("Customer " + i + "  Very High Risk");
				veryHighRisk++;
			} else {
				System.out.println("Customer " + i + "  Normal Risk");
				normalRisk++;
			}
		}

		double averageRisk = (double) totalRisk / customers;

		System.out.println("High Risk Youth: " + highRiskYouth);
		System.out.println("Senior Risk: " + seniorRisk);
		System.out.println("Very High Risk: " + veryHighRisk);
		System.out.println("Normal Risk: " + normalRisk);
		System.out.println("Average Risk Score: " + averageRisk);
		System.out.println("Highest Risk Customer Index: " + highestRiskIndex);
		scanner.close();
	}
}
