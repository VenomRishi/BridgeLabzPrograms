package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Stats5 {

	public static void main(String[] args) {
		Utility utility=new Utility();
		double fiveRandomNumberArray[]=new double[5];
		for(int i=0;i<=4;i++) {
			fiveRandomNumberArray[i]=utility.MathRandomNumber();
		}

	}

}
