/******************************************************************************
 *  Purpose: Program for Finding Spring Season or not
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

public class SpringSeason {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int year, month, day;
		boolean leapYear;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter Year (Eg: 2000)");
		year = scanner.nextInt();

		if (utility.LeapYearValidation(year)) {
			leapYear = utility.LeapYear(year);
			System.out.println("Please enter Month in Number");
			month = scanner.nextInt();
			if (month > 0 && month < 12) {
				System.out.println("Please enter Day in Number");
				day = scanner.nextInt();
				if (utility.CheckValidationForSpringSeason(month, day, leapYear)) {
					if (utility.CheckSpringSeason(month, day)) {
						System.out.println("Spring Season");
					} else {
						System.out.println("Not Spring Season");
					}

				} else {
					System.out.println("Please enter valid Day");
				}

			} else {
				System.out.println("Please enter valid Month");

			}

		} else

		{
			System.out.println("Please enter valid Year");
		}
		scanner.close();
	}

}
