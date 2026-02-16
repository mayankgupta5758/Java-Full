package com.mayank.forloop;

public class ReverseaNumber {
public static void main(String[] args) {
	int num = 1234;
	int rev = 0;

	for(; num != 0; num /= 10){
	    int digit = num % 10;
	    rev = rev * 10 + digit;
	}
	System.out.println(rev);

}
}
