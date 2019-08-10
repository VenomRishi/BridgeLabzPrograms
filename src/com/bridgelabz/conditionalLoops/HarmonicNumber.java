/******************************************************************************
 *  Purpose: Program is written for finding Series of Harmonic Number.
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

public class HarmonicNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("Enter Number Uptil you want to Find Harmonic");
		number=scanner.nextInt();
		utility.PrintHarmonic(number);
		
		scanner.close();

	}

}
