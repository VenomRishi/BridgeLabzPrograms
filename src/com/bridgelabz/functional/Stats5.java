/******************************************************************************
 *  Purpose: Program is written for Finding Random 5 numbers and to find
 *  		 minimum, maximum, average.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   08-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double tempMin = 0.0, tempMax = 0.0, sum = 0.0, avg = 0.0;
		double fiveRandomNumberArray[] = new double[5];
		for (int i = 0; i < fiveRandomNumberArray.length; i++) {
			fiveRandomNumberArray[i] = utility.mathRandomNumber();
		}
		System.out.println("Random Number");
		for (int i = 0; i < fiveRandomNumberArray.length; i++) {
			System.out.println(fiveRandomNumberArray[i]);
		}

//		for finding avarage
		for (int i = 0; i < fiveRandomNumberArray.length; i++) {
			sum += fiveRandomNumberArray[i];
		}
		avg = sum / 5;
		System.out.println("Average : " + avg);

		// for finding minimum from array
		tempMin = utility.mathMinNumber(fiveRandomNumberArray[0], fiveRandomNumberArray[1]);
		for (int i = 2; i < fiveRandomNumberArray.length; i++) {
			tempMin = utility.mathMinNumber(tempMin, fiveRandomNumberArray[i]);

		}
		System.out.println("Min Value :" + tempMin);
//		for finding minimum from array
		tempMax = utility.mathMaxNumber(fiveRandomNumberArray[0], fiveRandomNumberArray[1]);
		for (int i = 2; i < fiveRandomNumberArray.length; i++) {
			tempMax = utility.mathMaxNumber(tempMax, fiveRandomNumberArray[i]);

		}
		System.out.println("Max Value :" + tempMax);

	}

}
