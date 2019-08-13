/******************************************************************************
 *  Purpose: Program to find number of times roll dice.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RollDice {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int nTimesRollDice;
		int diceRoll;
	
		
		int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0;
		
		System.out.println("Enter number for rolling dice n times :");
		nTimesRollDice=scanner.nextInt();
		for(int i=0;i<nTimesRollDice;i++) {
			diceRoll=utility.getRandomNumber(1, 6);
			switch(diceRoll) {
			case 1:
				count1++;
				System.out.println("1");
				break;
			case 2:
				count2++;
				System.out.println("2");
				break;
			case 3:
				count3++;
				System.out.println("3");
				break;
			case 4:
				count4++;
				System.out.println("4");
				break;
			case 5:
				count5++;
				System.out.println("5");
				break;
			case 6:
				count6++;
				System.out.println("6");
				break;
				
			}
			
		}
		if(count1>=count2&&count1>=count3&&count1>=count4&&count1>=count5&&count1>=count6) 
			System.out.println("Dice 1 fall maximum times count is : "+count1);
		else if(count2>=count1&&count2>=count3&&count2>=count4&&count2>=count5&&count2>=count6) 
			System.out.println("Dice 2 fall maximum times count is : "+count2);
		else if(count3>=count1&&count3>=count2&&count3>=count4&&count3>=count5&&count3>=count6) 
			System.out.println("Dice 3 fall maximum times count is : "+count3);
		else if(count4>=count1&&count4>=count2&&count4>=count3&&count4>=count5&&count4>=count6) 
			System.out.println("Dice 4 fall maximum times count is : "+count4);
		else if(count5>=count1&&count5>=count2&&count5>=count3&&count5>=count4&&count5>=count6) 
			System.out.println("Dice 5 fall maximum times count is : "+count5);
		else 
			System.out.println("Dice 6 fall maximum times count is : "+count6);
		
        
        scanner.close();
	}

}
