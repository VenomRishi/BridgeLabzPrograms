/******************************************************************************
 *  Purpose: Program for Finding year from user to check whether it is Leap 
 *  		 Year or not.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int year;
		System.out.println("Please enter the year you want to find leap year or not(eg:2000)");
		year = scanner.nextInt();
		if (utility.LeapYearValidation(year)) {
			if (utility.LeapYear(year)) {
				System.out.println(year + " is Leap Year");
			} else {
				System.out.println(year + " is not Leap Year");
			}
		} else {
			System.out.println("Please enter valid year");
		}
		scanner.close();

	}

}
