/******************************************************************************
 *  Purpose: Program is written for performing trigonometric 
 *  		 function.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trigonometry {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int degree;
		double radiun;
		//variable csc is cosec
		double sin,cos,tan,cot,sec,csc;
		
		System.out.println("Enter the degree: ");
		degree=scanner.nextInt();
		radiun=utility.findRadiun(degree);
		
		//for finding sin cos tan
		sin=utility.findSin(radiun);
		cos=utility.findCos(radiun);
		tan=utility.findTan(radiun);
		
		cot=utility.findCot(radiun);
		sec=utility.findSec(radiun);
		csc=utility.findCosec(radiun);
		
		System.out.println(" Sin("+degree+") :"+sin);
		System.out.println(" Cos("+degree+") :"+cos);
		System.out.println(" Tan("+degree+") :"+tan);
		System.out.println(" Cot("+degree+") :"+cot);
		System.out.println(" Sec("+degree+") :"+sec);
		System.out.println(" Cosec("+degree+") :"+csc);
		scanner.close();

	}

}
