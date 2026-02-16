package com.mayank.forloop;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = scanner.nextInt();
	boolean prime = true;

	for(int i = 2; i <= num/2; i++){
	    if(num % i == 0){
	        prime = false;
	        break;
	    }
	}

	if(prime && num > 1)
	    System.out.println("Prime");
	else
	    System.out.println("Not Prime");
scanner.close();
}
}
