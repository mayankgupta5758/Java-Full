package com.mayank.whileloop;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = scanner.nextInt();
	int i = 2;
	boolean prime = true;

	while(i <= num/2){
	    if(num % i == 0){
	        prime = false;
	        break;
	    }
	    i++;
	}

	if(prime && num > 1)
	    System.out.println("Prime");
	else
	    System.out.println("Not Prime");
scanner.close();
}
}
