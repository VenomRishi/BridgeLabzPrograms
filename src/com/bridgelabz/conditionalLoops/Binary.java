/******************************************************************************
 *  Purpose: Program for finding decimal to binary.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, mod;
		String binary = "";
		System.out.println("Enter integer to find decimal to binary: ");
		number = scanner.nextInt();
		while (number > 0) {
			mod = number % 2;
			binary = mod+""+binary;
			number = number / 2;
		}
		System.out.println(binary);
		scanner.close();

	}

}
