package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RangeOfPrimeNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in) ;
		int numberOfInputs;
		System.out.println("Enter how much input going to put");
		numberOfInputs=scanner.nextInt();
		int numbersArray [] = new int[numberOfInputs] ;
		int primeNumberArray[] = new int[numberOfInputs],j=0;
		for(int i=1;i<=numberOfInputs-1;i++) {
			numbersArray[i]=i;
			if(utility.isPrime(numbersArray[i])) {
				primeNumberArray[j]=numbersArray[i];
				j++;
			}
		}
		System.out.print("Prime Numbers is ");
		for(int i=0;i<=primeNumberArray.length-1;i++) {
			System.out.print(primeNumberArray[i]+" ");
		}
		
		scanner.close();

	}

}
