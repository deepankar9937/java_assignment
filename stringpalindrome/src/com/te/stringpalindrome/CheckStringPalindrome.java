package com.te.stringpalindrome;

import java.util.Scanner;

public class CheckStringPalindrome {
	public static boolean isPalindrome(String inputString) {
		ReverseString reverseString = new ReverseString();
		String result = reverseString.reverseString(inputString);

		if (inputString.equalsIgnoreCase(result)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();

//		

		System.out.println(isPalindrome(inputString));

		if (isPalindrome(inputString) == true) {
			System.out.println("The String is Palindrome.");
		} else {
			System.out.println("The String is Not Palindrome.");
		}

	}
}
