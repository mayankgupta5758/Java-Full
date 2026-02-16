package com.mayank.whileloop;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();

    int temp = num;
    int count = 0;
    int sum = 0;

    while(temp != 0){
        count++;
        temp /= 10;
    }

    temp = num;

    while(temp != 0){
        int digit = temp % 10;
        sum += Math.pow(digit, count);
        temp /= 10;
    }

    if(sum == num)
        System.out.println("Armstrong Number");
    else
        System.out.println("Not Armstrong Number");
    
    sc.close();
}
}
