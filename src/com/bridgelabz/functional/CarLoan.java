/******************************************************************************
 *  Purpose: Program is written for Finding EMI of car loan for Month
 *  		 according to data has been given by the user like principal loan
 *  		 amount, tenure, rate of interest.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int principalLoanAmount,year;
		double rOI,amountToPayForMonth;
		
		System.out.println("Enter Principal Loan Amount");
		principalLoanAmount=scanner.nextInt();
		System.out.println("Enter Year");
		year=scanner.nextInt();
		System.out.println("Enter Rate Of Interest");
		rOI=scanner.nextDouble();
		amountToPayForMonth=utility.LoanCalculator(principalLoanAmount,year,rOI);
		System.out.println("Amount to Pay :"+amountToPayForMonth+" For Year :"+year);
		scanner.close();

	}

}
