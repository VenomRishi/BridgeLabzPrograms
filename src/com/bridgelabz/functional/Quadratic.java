/******************************************************************************
 *  Purpose: Program is written for Quadratic Equation.
 *  		 ( a*x*x + b*x + c = 0 )
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	private static Scanner scanner;

	public static void main(String[] args) {
		Utility utility = new Utility();
		int a, b, c;
		double sqrtDelta;
		
		double equation1,equation2;
		scanner = new Scanner(System.in);
		System.out.println("Enter value for a");
		a=scanner.nextInt();
		System.out.println("Enter value for b");
		b=scanner.nextInt();
		System.out.println("Enter value for c");
		c=scanner.nextInt();
		
		//now we are going to find delta
		sqrtDelta=utility.FindDeltaSquarRoot(a,b,c);
		
		equation1=utility.QuadraticEquation1(a,b,sqrtDelta);
		equation2=utility.QuadraticEquation2(a,b,sqrtDelta);
		
		System.out.println("Root 1 of X is :"+equation1);
		System.out.println("Root 2 of X is :"+equation2);
	}

}
