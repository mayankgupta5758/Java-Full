package com.mayank.forloop;

public class PalindromeNumber {
public static void main(String[] args) {
	int num = 121;
	int temp = num, rev = 0;

	for(; temp != 0; temp /= 10){
	    rev = rev * 10 + temp % 10;
	}

	if(num == rev)
	    System.out.println("Palindrome");
	else
	    System.out.println("Not Palindrome");

}
}
