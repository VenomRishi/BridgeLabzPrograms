package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class GamlingSimulation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int stake,countWin=0,countLoose=0;
		int percentageWin,percentageLoose,numberOfBets=0,avgBets;
		System.out.println("Enter amount for playing game: ");
		stake = scanner.nextInt();
		
		for(int i=stake;i>0;i--) {
			if(Math.random()>0.5) {
				System.out.println("Gamler Won!!");
				countWin++;
				//stake++;
			}else {
				System.out.println("Gamler Lost!");
				countLoose++;
			}
			numberOfBets++;
		}
		percentageWin=countWin*100/stake;
		percentageLoose=countLoose*100/stake;
		
//		avgBets=
		
		System.out.println("Gamler Won :"+countWin+" times");
		System.out.println("Percentage of Winning is :"+percentageWin);
		
		
		
		scanner.close();

	}

}
