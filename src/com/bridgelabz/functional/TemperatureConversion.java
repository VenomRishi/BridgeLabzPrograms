/******************************************************************************
 *  Purpose: Program for Finding Temperature Conversion.
 *  		 origin x1=0, y1=0;
 *  		 distance x2=from user and y2=from user
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	public static void main(String []args) {
		Utility utility=new Utility();
		double temperatureInFerenheit,temperatureInCelcius;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Temperature in Ferenheit : ");
		temperatureInFerenheit=scanner.nextDouble();
		temperatureInCelcius=utility.FahrenheitToCelsius(temperatureInFerenheit);
		System.out.println("Fahrenheit to Celcius of "+temperatureInFerenheit+" is "+temperatureInCelcius);
		
		System.out.println("Enter Temperature in Celsius : ");
		temperatureInCelcius=scanner.nextDouble();
		temperatureInFerenheit=utility.CelsiusToFahrenheit(temperatureInCelcius);
		System.out.println("Celcius to Fahrenheit of "+temperatureInCelcius+" is "+temperatureInFerenheit);
		
		scanner.close();
	}
}
