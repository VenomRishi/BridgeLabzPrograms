package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GamlingSimulation {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int stake,goals,days;
		
		System.out.println("Enter amount for playing game: ");
		stake = scanner.nextInt();
		System.out.println("Enter Goals");
		goals=scanner.nextInt();
		System.out.println("Enter days for play");
		days=scanner.nextInt();
		utility.GamlingSimulation(stake,goals,days);
		
		
		scanner.close();

	}

}
