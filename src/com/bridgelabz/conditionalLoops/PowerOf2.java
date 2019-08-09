/******************************************************************************
 *  Purpose: Program is written for finding Power Table.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int number, result, powerOfNumber;
		System.out.println("Enter Number For Finding Table of Power of Two: ");
		number = scanner.nextInt();
		powerOfNumber = utility.PowerOfTwo(number);// 5 ==32

		for (int i = 1; i <= powerOfNumber; i++) {

			result = utility.PowerOfTwo(i);
			System.out.println(i + " to Power of 2 is : " + result);

		}

		scanner.close();

	}

}
