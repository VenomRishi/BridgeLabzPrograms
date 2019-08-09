/******************************************************************************
 *  Purpose: Program is written for find wind chill.
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

public class WindChill {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int temperature,velocity;
		double speed, temperatureInFahrenheit = 0,windChill;
		System.out.println("Enter Temperature (Celcius):");
		temperature=scanner.nextInt();
		System.out.println("Enter Velocity in KMPH:");
		velocity=scanner.nextInt();
		if(temperature<=50&&temperature>0&&velocity>=3&&velocity>120) {
			temperatureInFahrenheit=utility.CelsiusToFahrenheit(temperature);
			speed=utility.velocityIntoSpeed(velocity);
			speed=Math.pow(speed, 0.16);
			windChill=utility.CalculateWindChill(temperatureInFahrenheit,speed);
			System.out.println("By Calculating wind chill is: "+windChill);	
		}else {
			System.out.println("Input given is not meeting requirement\nPlease try again...");
		}
		
		scanner.close();
	
	}

}
