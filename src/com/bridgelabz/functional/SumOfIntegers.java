
/******************************************************************************
 *  Purpose: Program is written for addition of two integers.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SumOfIntegers {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int firstNumber, secondNumber, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first integer");
		firstNumber = scanner.nextInt();
		System.out.println("Please enter second integer");
		secondNumber = scanner.nextInt();
		result = utility.sumOfTwoIntegers(firstNumber, secondNumber);
		System.out.println("Result: " + result);
		scanner.close();

	}
}
