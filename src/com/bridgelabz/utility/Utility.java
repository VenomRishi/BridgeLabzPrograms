/******************************************************************************
 *  Purpose: This is utility file which contains logic for functional files.
 *  		 this file is having methods who can take input process it and 
 *  		 returns the output.
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class Utility {

	/**
	 * Purpose: Method is written for addition of two integer
	 * 
	 * @param firstNumber  first integer input is taken
	 * @param secondNumber second integer input is taken
	 * 
	 * @return return result result will return sum of firstNumber and secondNumber
	 */
	public int sumOfTwoIntegers(int firstNumber, int secondNumber) {
		int result = firstNumber + secondNumber;
		return result;

	}

	/**
	 * Purpose: Method is written for Integer Operation a + b * c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation1(int a, int b, int c) {
		int result = a + b * c;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation a * b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation2(int a, int b, int c) {
		int result = a * b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation c + a / b
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * @return result mathematical expression written in method
	 */
	public int IntOperation3(int a, int b, int c) {
		int result = c + a / b;
		return result;
	}

	/**
	 * Purpose: Method is written for Integer Operation a % b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public int IntOperation4(int a, int b, int c) {
		int result = a % b + c;
		return result;
	}

	/***********************************************************
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	/**
	 * Purpose: Method is written for Double Operation a + b * c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation1(double a, double b, double c) {
		double result = a + b * c;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation a * b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation2(double a, double b, double c) {
		double result = a * b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation c + a / b
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation3(double a, double b, double c) {
		double result = c + a / b;
		return result;
	}

	/**
	 * Purpose: Method is written for Double Operation a % b + c
	 * 
	 * @param a the first input
	 * @param b the second input
	 * @param c the third input
	 * 
	 * @return result mathematical expression written in method
	 */
	public double DoubleOperation4(double a, double b, double c) {
		double result = a % b + c;
		return result;
	}

	/**
	 * Purpose: Method is written for Leap Year validation input accept from 1582 to
	 * 9999
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean LeapYearValidation(int year) {
		if (year >= 1582 && year <= 9999) {
			return true;
		}
		return false;

	}

	/**
	 * Purpose: Method is written for Given Year is Leap Year or Not
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean LeapYear(int year) {

		if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Purpose: Method is written for Checking Validation leap Year or not and by
	 * Calendar wise it will give days back to method where definition is there
	 * 
	 * @param year input is taken from user
	 * @return if leap year then true else false
	 */
	public boolean CheckValidationForSpringSeason(int month, int day, boolean leapYear) {

		switch (month) {
		case 1:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 2:
			if (leapYear) {
				if (day > 0 && day <= 29) {
					return true;
				}

			} else {
				if (day > 0 && day <= 28) {
					return true;
				}
			}

		case 3:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 4:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 5:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 6:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 7:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 8:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 9:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 10:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		case 11:
			if (day > 0 && day <= 30) {
				return true;
			} else {
				return false;
			}
		case 12:
			if (day > 0 && day <= 31) {
				return true;
			} else {
				return false;
			}
		default:
			System.out.println("Please enter valid input");
		}
		return false;

	}

	/**
	 * Purpose: Method is written for finding Spring Season
	 * 
	 * @param month month will be taken from user from 1 to 12
	 * @param day   day will be taken from user from 1 to 31
	 * @return if SpringSeason return true else return false
	 */
	public boolean CheckSpringSeason(int month, int day) {

		if (month == 3) {
			if (day >= 20) {
				return true;
			}
		} else if (month == 4) {
			if (day > 0 && day <= 30) {
				return true;
			}
		} else if (month == 5) {
			if (day > 0 && day <= 31) {
				return true;
			}
		} else if (month == 6) {
			if (day <= 20) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Purpose: Method is written for finding delta for Quadratic Equation
	 * 
	 * @param a input a
	 * @param b input b
	 * @param c input c
	 * @return delta finding delta using formula
	 */

	public double FindDelta(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		return delta;
	}

	/**
	 * Purpose: Method is written for finding first Quadratic Equation
	 * 
	 * @param a
	 * @param b
	 * @param sqrtDelta
	 * @return
	 */
	public double QuadraticEquation1(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation1 = (-b + sqrtDelta) / (2 * a);
		return equation1;
	}

	/**
	 * Purpose: Method is written for finding second Quadratic Equation
	 * 
	 * @param a
	 * @param b
	 * @param delta
	 * @return
	 */
	public double QuadraticEquation2(int a, int b, double delta) {
		double absDelta = Math.abs(delta);
		double sqrtDelta = Math.sqrt(absDelta);
		double equation2 = (-b - sqrtDelta) / (2 * a);
		return equation2;
	}

	/**
	 * Purpose: Method is written for finding Euclidean Distance From Origin
	 * 
	 * @param x1 input 0
	 * @param y1 input 0
	 * @param x2 input taken from user
	 * @param y2 input taken from user
	 * @return distance function will calculate the distance and return it
	 */
	public double EuclideanDistance(int x1, int y1, int x2, int y2) {
		double distance, powerofx, powerofy, sumOfPowerXY;
		int x, y;
		x = x2 - x1;
		y = y2 - y1;
		powerofx = Math.pow(x, 2);
		powerofy = Math.pow(y, 2);

		sumOfPowerXY = powerofx + powerofy;

		distance = Math.sqrt(sumOfPowerXY);
		return distance;
	}

	/**
	 * Purpose: Method is written for getting random number
	 * 
	 * @param min take input 1
	 * @param max take input 6
	 * @return random finds random number and return it.
	 */
	public int getRandomNumber(int min, int max) {
		/*
		 * Random random = new Random(); return random.nextInt((max - min) + 1) + min;
		 */
		int range = max - min + 1;
		int random = (int) (Math.random() * range) + 1;
		return random;

	}

	/**
	 * Purpose: Method is written for Converting Temperature Fahrenheit to Celsius
	 * 
	 * @param temperatureInFerenheit
	 * @return temperatureInCelcius return temperature in celsius
	 */
	public double FahrenheitToCelsius(double temperatureInFerenheit) {
		double temperatureInCelcius;
		temperatureInCelcius = ((temperatureInFerenheit - 32) * 5) / 9;
		return temperatureInCelcius;
	}

	/**
	 * Purpose: Method is written for Converting Temperature Celcius to Fahrenheit
	 * 
	 * 
	 * @param temperatureInCelsius
	 * @return temperatureInFahrenheit return temperature in fahrenheit
	 */
	public double CelsiusToFahrenheit(double temperatureInCelsius) {
		double temperatureInFahrenheit;
		temperatureInFahrenheit = ((temperatureInCelsius * 9) / 5) + 32;
		return temperatureInFahrenheit;
	}

	/**
	 * Purpose: This method will calculate the EMI for the month on the basis of
	 * loan amount for particular year and it will be depend upon the rate of
	 * interest given for the loan.
	 * 
	 * @param principalLoanAmount input taken for principal amount of loan
	 * @param year                input taken for how much year of loan
	 * @param rOI                 input taken for interest for the loan
	 * @return paymentAmountForMonth
	 * 
	 *         in this it calculating the amount to pay for every month
	 */
	public double LoanCalculator(int principalLoanAmount, int year, double rOI) {

		double payment, r;
		int n;
		n = 12 * year;
		r = (rOI / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}

	/**
	 * Purpose: Generate Random Number using Math.random() method
	 * 
	 * @return return random number
	 */
	public double MathRandomNumber() {

		return Math.random();
	}

	/**
	 * Purpose: Finding Minimum between two number using Math.min() method
	 * 
	 * @param a input of array index 1st
	 * @param b input of array index 2st
	 * @return compare and return minimum between two
	 */
	public double MathMinNumber(double a, double b) {
		return Math.min(a, b);
	}

	/**
	 * Purpose: Finding Maximum between two number using Math.max() method
	 * 
	 * @param a input of array index 1st
	 * @param b input of array index 2st
	 * @return compare and return maximum between two
	 */
	public double MathMaxNumber(double a, double b) {
		return Math.max(a, b);
	}

	/**
	 * Purpose: Reversing the String Array
	 * 
	 * @param namesArray    getting array from the user input
	 * @param start         this parameter tells the starting array index
	 * @param lengthOfArray this parameter tells the ending array index
	 * @return reverseArray it returns the reverse String array
	 */
	public String[] ReverseStringArray(String[] namesArray, int start, int lengthOfArray) {

		// for reversing the nameArray

		String temp;
		while (start < lengthOfArray) {
			temp = namesArray[start];
			namesArray[start] = namesArray[lengthOfArray];
			namesArray[lengthOfArray] = temp;
			start++;
			lengthOfArray--;
		}
		return namesArray;
	}

}
