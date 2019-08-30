package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int number, mod;
//		String binary = "";
//		System.out.println("Enter integer to find decimal to binary: ");
//		number = scanner.nextInt();
//		while (number > 0) {
//			mod = number % 2;
//			binary = binary + "" + mod;
//			number = number / 2;
//		}
//		System.out.println(binary);
//		scanner.close();
		int decimalNumber, r;
		int decToBinary;
		int resultOfSwapNibbles;
		String x = "";
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		decimalNumber = scanner.nextInt();
		decToBinary = decimalNumber;
		if (decimalNumber > 255) {
			System.out.println("Enter Number between 1 to 255");
		} else {

			while (decimalNumber > 0) {
				r = decimalNumber % 2;
				x = r + "" + x;
				decimalNumber = decimalNumber / 2;
			}

			System.out.println("Binary is: " + x);

			resultOfSwapNibbles = utility.SwapNibbles(decToBinary);
			System.out.println("Result of Swap Nibbles of binary number: "+resultOfSwapNibbles);
		}
		
		scanner.close();

	}

}
