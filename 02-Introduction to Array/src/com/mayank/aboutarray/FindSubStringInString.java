package com.mayank.aboutarray;

import java.util.Scanner;

public class FindSubStringInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scanner.nextLine();
		System.out.println("Enter the subString: ");
		String subString = scanner.nextLine();
		
		if (str == null || subString == null) {
            System.out.println("Error: Null strings are not allowed.");
            return;
        }
		
        if (subString.isEmpty()) {
            System.out.println("subString cannot be empty.");
            return;
        }
		
		if (str.contains(subString)) {
            System.out.println("Found the suubString.");
        } else {
            System.out.println("Not Found the sunString");
        }
		scanner.close();
	}

}
