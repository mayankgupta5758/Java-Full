package com.mayank.forloop;

import java.util.Scanner;
import java.util.Random;

public class NumberGuesserGame {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";   

        while (playAgain.equalsIgnoreCase("yes")) {

            int randomNumber = random.nextInt(100) + 1; 
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;

            System.out.println("\nRandom number generated between 1 to 100");

            while (attempts < maxAttempts) {

                System.out.print("Guess a number: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < randomNumber) {
                    System.out.println("Sorry, Too Low");
                } 
                else if (guess > randomNumber) {
                    System.out.println("Sorry, Too High");
                } 
                else {
                    System.out.println("You won in attempt: " + attempts);
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("You lost! The correct number was: " + randomNumber);
            }

            System.out.print("Do you want to play again (yes/no): ");
            playAgain = scanner.next();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
