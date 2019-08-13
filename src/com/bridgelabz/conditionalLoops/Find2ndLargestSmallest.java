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
