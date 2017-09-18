package com.hcl.programmingchallenge2;

import java.util.Scanner;

/**
 * Reverse of a string without reverse method.
 * @author hmuppala
 *
 */
public class StringReverse {
	private static Scanner scanner;

	public static void main(String args[]) {
		try {
			System.out.println("Please enter a string");
			scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			System.out.print("Reverse of the given String is: ");
			for (int i = input.length()-1; i >= 0; i--) {
				System.out.print(input.charAt(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}
