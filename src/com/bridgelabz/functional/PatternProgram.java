package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PatternProgram {

	public static void main(String[] args) {
		Utility utility = new Utility();
		char alphabet;
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter char: ");
		input = scanner.next();
		input = input.toLowerCase();
		alphabet = input.charAt(0);
		switch (alphabet) {
		case 'k':
			utility.printKPattern();
			break;
		case 'd':
			utility.printDPattern();
			break;
		case 'w':
			utility.printWPattern();
			break;
		default:
			System.out.println("Enter input of K D W");
		}
		scanner.close();

	}

}
