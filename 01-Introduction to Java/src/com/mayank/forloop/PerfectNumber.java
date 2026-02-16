package com.mayank.forloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int sum = 0;

		for(int i = 1; i <= num/2; i++){
		    if(num % i == 0)
		        sum += i;
		}

		if(sum == num)
		    System.out.println("Perfect");
		else
		    System.out.println("Not Perfect");

		scanner.close();
	}

}
