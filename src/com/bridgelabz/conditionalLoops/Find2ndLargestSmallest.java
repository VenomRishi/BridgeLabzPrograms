package com.bridgelabz.conditionalLoops;

import com.bridgelabz.utility.Utility;

public class Find2ndLargestSmallest {
	public static void main(String[] args) {
		Utility utility = new Utility();
		int numberArray[] = { 2, 1, 5, 4, 6, 3 };

		int secondSmallest;

		int secondLargest;

		secondSmallest = utility.findSecondSmaller(numberArray);
		secondLargest = utility.findSecondLargest(numberArray);

		System.out.println("Second Smallest is : " + secondSmallest);
		System.out.println("Second Largest is : " + secondLargest);

	}

}
