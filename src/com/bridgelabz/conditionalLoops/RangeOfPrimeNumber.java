/******************************************************************************
 *  Purpose: Program to find prime number between range is given by user.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		int end;
		int start;
		int numbersArray[];
		int countPrimeNumber = 0,j=0;
		System.out.println("Enter Range for finding prime numbers");
		System.out.println("enter start");
		start=scanner.nextInt();
		System.out.println("enter end");
		end = scanner.nextInt();
		numbersArray= new int[end];
		
		for (int i = start; i <= end - 1; i++) {
			numbersArray[i] = i;
			if (utility.isPrime(numbersArray[i])) {
				countPrimeNumber++;
			}
		}
		
		int primeNumberArray[] = new int[countPrimeNumber];
		
		for(int i=1;i<=end-1;i++) {
			if(utility.isPrime(numbersArray[i])) {
				primeNumberArray[j]=numbersArray[i];
				j++;
			}
		}

		System.out.print("Prime Numbers is ");
		
		for (int i = 0; i <= primeNumberArray.length - 1; i++) {
			System.out.print(primeNumberArray[i] + " ");
		}

		scanner.close();

	}

}
