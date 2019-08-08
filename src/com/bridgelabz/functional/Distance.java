/******************************************************************************
 *  Purpose: Program for Finding Euclidean Distance.
 *  		 origin x1=0, y1=0;
 *  		 distance x2=from user and y2=from user
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility = new Utility();

		int x1 = 0, y1 = 0;
		int x2, y2;

		double distance;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the value of x");
		x2 = scanner.nextInt();
		System.out.println("Please enter the value of y");
		y2 = scanner.nextInt();

		distance = utility.EuclideanDistance(x1, y1, x2, y2);

		System.out.println("Euclidean Distance of x and y from origin is: " + distance);
		scanner.close();

	}

}
