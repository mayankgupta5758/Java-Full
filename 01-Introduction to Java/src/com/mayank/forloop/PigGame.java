package com.mayank.forloop;

import java.util.Scanner;
import java.util.Random;

public class PigGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int totalScore = 0;
        int turn = 1;

        System.out.println("Let's Play PIG!\n");
        System.out.println("* See how many turns it takes you to get to 20.");
        System.out.println("* Turn ends when you hold or roll a 1.");
        System.out.println("* If you roll a 1, you lose all points for the turn.");
        System.out.println("* If you hold, you save all points for the turn.\n");

        while (totalScore < 20) {

            System.out.println("TURN " + turn);
            int turnScore = 0;
            boolean turnOver = false;

            while (!turnOver) {

                System.out.print("Roll or hold? (r/h): ");
                char choice = scanner.next().charAt(0);

                if (choice == 'r' || choice == 'R') {

                    int die = random.nextInt(6) + 1;
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.\n");
                        turnScore = 0;
                        turnOver = true;
                    } else {
                        turnScore += die;
                    }

                } else if (choice == 'h' || choice == 'H') {

                    totalScore += turnScore;
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + totalScore + "\n");
                    turnOver = true;

                } else {
                    System.out.println("Invalid choice! Enter r or h.");
                }
            }

            turn++;
        }

        System.out.println("You finished in " + (turn - 1) + " turns!");
        System.out.println("\nGame over!");

        scanner.close();
    }
}
