package com.mayank.whileloop;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = scanner.nextInt();
	int temp = num, rev = 0;

	while(temp != 0){
	    rev = rev * 10 + temp % 10;
	    temp /= 10;
	}

	if(num == rev)
	    System.out.println("Palindrome");
	else
	    System.out.println("Not Palindrome");
scanner.close();
}
}
