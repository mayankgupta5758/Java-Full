package com.mayank.arrayassign;
import java.util.Scanner;

public class ElectricityUsagePatternDetector {

    public static void main(String[] args) {
    	
//    	usage = [120, 450, 520, 530, 540, 300, 80, 95, 600, 620,
//    	         610, 200, 150, 700, 710, 720, 100, 90, 85, 400,
//    	         420, 430, 440, 450, 460, 470, 480, 490, 300, 350]

        Scanner scanner = new Scanner(System.in);

        int[] usage = new int[30];

        System.out.println("Enter electricity usage for 30 days:");

        for (int i = 0; i < 30; i++) {
            usage[i] = scanner.nextInt();
        }

        int highConsumptionCount = 0;
        int totalUsage = 0;
        boolean overloadWarning = false;


        for (int i = 0; i < 30; i++) {

            totalUsage += usage[i];

            if (usage[i] > 500) {
                System.out.println("Day " + (i + 1) + "  High Consumption");
                highConsumptionCount++;
            }
            else if (usage[i] < 100) {
                System.out.println("Day " + (i + 1) + "  Low Usage Alert");
            } 
            else {
                System.out.println("Day " + (i + 1) + "  Normal Usage");
            }

            if (i >= 2) {
                if (usage[i] > 500 &&
                    usage[i - 1] > 500 &&
                    usage[i - 2] > 500) {

                    overloadWarning = true;
                }
            }
        }

        double average = (double) totalUsage / 30;

        System.out.println("Monthly Average Usage: " + average);
        System.out.println("High Consumption Days: " + highConsumptionCount);

        if (overloadWarning) {
            System.out.println("Overload Warning Detected (3 consecutive high days)");
        } else {
            System.out.println("No Overload Warning");
        }

        if (average > 400) {
            System.out.println("Heavy Month");
        }
        scanner.close();
    }
}
