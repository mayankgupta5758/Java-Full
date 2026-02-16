package com.mayank.whileloop;

import java.util.Scanner;

public class ReverseaNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	int num = scanner.nextInt();
	int rev = 0;

	while(num != 0){
	    int digit = num % 10;
	    rev = rev * 10 + digit;
	    num /= 10;
	}
	System.out.println(rev);
	scanner.close();

}
}
