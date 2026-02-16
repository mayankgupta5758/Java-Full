package com.mayank.arrayassign;

import java.util.Scanner;

public class StudentPerformanceHeatmap {

	public static void main(String[] args) {
		
//				n = 4
//				marks = {
//				 {90, 88, 92, 85, 87},   
//				 {75, 70, 65, 80, 72},   
//				 {55, 58, 52, 50, 54},   
//				 {40, 30, 60, 70, 80}    
//				}

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + i + ":");
            for (int j = 0; j < 5; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        int distinctionCount = 0;
        double[] subjectTotal = new double[5];


        for (int i = 0; i < n; i++) {

            int total = 0;
            boolean isFail = false;

            for (int j = 0; j < 5; j++) {

                total += marks[i][j];
                subjectTotal[j] += marks[i][j];

                if (marks[i][j] < 35) {
                    isFail = true;
                }
            }

            double average = total / 5.0;

            System.out.print("Student " + i + " → ");

            if (isFail) {
                System.out.println("Fail");
            } 
            else if (average >= 85) {
                System.out.println("Distinction");
                distinctionCount++;
            } 
            else if (average >= 60) {
                System.out.println("First Class");
            } 
            else if (average >= 50) {
                System.out.println("Second Class");
            } 
            else {
                System.out.println("Pass");
            }
        }

        int bestSubjectIndex = 0;
        double highestAvg = subjectTotal[0] / n;

        for (int j = 1; j < 5; j++) {
            double avg = subjectTotal[j] / n;
            if (avg > highestAvg) {
                highestAvg = avg;
                bestSubjectIndex = j;
            }
        }

        System.out.println("Total Distinctions: " + distinctionCount);
        System.out.println("Subject with Highest Average: Subject " + bestSubjectIndex);
        
        scanner.close();
	}

}
