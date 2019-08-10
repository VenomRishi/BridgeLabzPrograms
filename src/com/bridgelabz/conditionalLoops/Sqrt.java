/******************************************************************************
 *  Purpose: Program is written for finding Square Root using Newtons Method.
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

public class Sqrt {

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int c;
		double result;
		System.out.println("Enter Nonnegative value");
		c = scanner.nextInt();
		if (c > 0) {
			result =(int) utility.findSquareRootUsingNewtonsMethod(c);
			System.out.println("Square Root of " + c + " using Newtons Law is " + result);
		} else {
			System.out.println("Please enter positive value..");
		}
		
		scanner.close();
	}
}