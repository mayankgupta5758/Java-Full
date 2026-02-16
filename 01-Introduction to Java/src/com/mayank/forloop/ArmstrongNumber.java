package com.mayank.forloop;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();

    int temp = num;
    int count = 0;
    int sum = 0;

    for(; temp != 0; temp /= 10){
        count++;
    }

    temp = num;

    for(; temp != 0; temp /= 10){
        int digit = temp % 10;
        sum += Math.pow(digit, count);
    }

    if(sum == num)
        System.out.println("Armstrong Number");
    else
        System.out.println("Not Armstrong Number");
    sc.close();
}
}
