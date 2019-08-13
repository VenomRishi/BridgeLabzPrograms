/******************************************************************************
 *  Purpose: Program to find repeated integer between 1 to 100 numbers.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import com.bridgelabz.utility.Utility;

public class FindRepeatedNumber {

	public static void main(String[] args) {
		Utility utility=new Utility();
		
		int numberArray[]= {1,2,3,4,5,6,7,8,9,6};
		int repeatedNumber;
	
		repeatedNumber=utility.findRepeatedInArray(numberArray);
		
		System.out.println("Repeated Number is : "+repeatedNumber);
		
	}

}
