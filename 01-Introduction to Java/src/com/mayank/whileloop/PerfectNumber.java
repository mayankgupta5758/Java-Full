package com.mayank.whileloop;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int i = 1, sum = 0;

		while(i <= num/2){
		    if(num % i == 0)
		        sum += i;
		    i++;
		}

		if(sum == num)
		    System.out.println("Perfect");
		else
		    System.out.println("Not Perfect");
scanner.close();
	}

}
