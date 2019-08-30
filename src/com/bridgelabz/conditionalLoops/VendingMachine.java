package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

public class VendingMachine {
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money;
		System.out.println("Enter amount to dispense: ");
		money = scanner.nextInt();
		vendingMachine(money);
		scanner.close();
	}

	public static void vendingMachine(int money) {
		int i=0,rem;
		while(money>0) {
			if(money>=notes[i]) {
				int calcNotes=money/notes[i];
				rem=money%notes[i];
				money=rem;
				System.out.println(notes[i]+   " Notes ---> " +calcNotes );
			}
			i++;	
		}
	}

}
