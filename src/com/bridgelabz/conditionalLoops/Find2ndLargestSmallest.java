/******************************************************************************
 *  Purpose: Program to find 2nd smallest and 2nd largest in the array
 *  		 without sorting the array.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import com.bridgelabz.utility.Utility;

public class Find2ndLargestSmallest {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int numberArray[] = { 1, 2, 3, 4, 5, 6 };

		int smallest, secondSmallest;
		smallest = Integer.MAX_VALUE;
		secondSmallest = Integer.MAX_VALUE;
		int largest, secondLargest;
		largest = Integer.MIN_VALUE;
		secondLargest = Integer.MIN_VALUE;

		secondSmallest = utility.findSecondSmaller(smallest, secondSmallest, numberArray);
		secondLargest = utility.findSecondLargest(largest, secondLargest, numberArray);

		System.out.println("Second Smallest is : " + secondSmallest);
		System.out.println("Second Largest is : " + secondLargest);

	}

}
