package com.hcl.programmingchallenge2;

import java.util.Scanner;

/**
 * Find a palindrome
 * @author hmuppala
 *
 */
public class Palindrome {
	private static Scanner scanner;
	private static String input;

	public static void main(String args[]) {
		scanner = new Scanner(System.in);
		try {
			System.out.println("Please enter X to exit!");
			System.out.print("Please enter a string: ");
			input = scanner.nextLine();
			while (!input.equalsIgnoreCase("X")){
				String reverse = new StringBuffer(input).reverse().toString();
				if (input.equalsIgnoreCase(reverse)) {
					System.out.println(input + " is a palindrome!");
				} else {
					System.out.println(input + " is not a palindrome!");
				}
				System.out.println("Please enter a string: ");
				input = scanner.nextLine();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

}
