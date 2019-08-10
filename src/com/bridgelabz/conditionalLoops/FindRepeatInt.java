package com.bridgelabz.conditionalLoops;

import com.bridgelabz.utility.Utility;

public class FindRepeatInt {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int numberArray[]= {1,1,2,3,4};
		int tempNum=numberArray[0],x=0;
		int counter=0;
		int lengthOfArray=numberArray.length-1;
		while(x<=lengthOfArray) {
			for(int i=0;i<=lengthOfArray;i++) {
				if(tempNum==numberArray[i++]) {
					counter++;
				}
			}
			tempNum[x];
		}

	}

}
