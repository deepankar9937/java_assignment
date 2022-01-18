package com.te.stringpalindrome;

import java.util.Scanner;

public class ReverseString {
	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			result = result + str.charAt(i);
		}
		System.out.println("The Reverse String is :- "+result);
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		reverseString(str);
	}
}
