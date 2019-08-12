package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class RollDice {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int nTimesRollDice;
		int diceRoll;
		int arrayCount[]=new int[5];
		
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
		arrayCount[0]=count1;
		arrayCount[1]=count2;
		arrayCount[2]=count3;
		arrayCount[3]=count4;
		arrayCount[4]=count5;
		arrayCount[5]=count6;
		
		int max = arrayCount[0];
        for(int i = 0; i < 5; i++)
        {
            if(max < arrayCount[i])
            {
                max = arrayCount[i];
            }
        }
        
	}

}
