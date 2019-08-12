package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactorial {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int number,fact=1;
		
		System.out.println("Enter number");
		number=scanner.nextInt();
		
		for(int i=2;i*i<=number;i++) {
			if(utility.isPrime(i)){
				fact=fact*i;
				System.out.println("Factorial of number "+i+" is "+fact);
			}
		}
		
		scanner.close();
		

	}

}
