/******************************************************************************
 *  Purpose: Program for performing four different operations with double
 *  		 are as follows:
 *  		 a + b *c, 
 *  		 a * b + c, 
 *  		 c + a / b, 
 *  		 and a % b + c.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DoubleOperation {

	public static void main(String[] args) {
		Utility utility = new Utility();
		double a, b, c, result;
		int operationSelect;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter int value for a");
		a = scanner.nextDouble();

		System.out.println("Please enter int value for b");
		b = scanner.nextDouble();

		System.out.println("Please enter int value for c");
		c = scanner.nextDouble();
		
		System.out.println("Please select operation: \n1. a + b *c\n2. a * b + c\n3. c + a / b\n4. a % b + c\n5. Exit");
		
		loopdowhile: do {

			operationSelect = scanner.nextInt();

			switch (operationSelect) {
			case 1:
				result = utility.DoubleOperation1(a, b, c);
				System.out.println("Operation 1 result : " + result);
				break;
			case 2:
				result = utility.DoubleOperation2(a, b, c);
				System.out.println("Operation 2 result : " + result);
				break;
			case 3:
				result = utility.DoubleOperation3(a, b, c);
				System.out.println("Operation 3 result : " + result);
				break;
			case 4:
				result = utility.DoubleOperation4(a, b, c);
				System.out.println("Operation 4 result : " + result);
				break;
			case 5:
				break loopdowhile;
			default:
				System.out.println("Please select correct operation");
				break;

			}
			System.out.println("Please select another operation from 1-4");

		} while (true);
		System.out.println("You have to rerun the program for do more operations");
		scanner.close();
	}

}
