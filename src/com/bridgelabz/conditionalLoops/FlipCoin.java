/******************************************************************************
 *  Purpose: Program is written for finding Flip Coin Heads And Tails Count.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int numberForCoinFlip;
		System.out.println("Enter number for flip coin: ");
		numberForCoinFlip=scanner.nextInt();
		utility.FlipCoin(numberForCoinFlip);
		scanner.close();
		

	}

}
