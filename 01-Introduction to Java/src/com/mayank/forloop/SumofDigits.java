package com.mayank.forloop;

public class SumofDigits {
public static void main(String[] args) {
	int num = 1234;
	int sum = 0;

	for(; num != 0; num /= 10){
	    sum += num % 10;
	}
	System.out.println(sum);

}
}
