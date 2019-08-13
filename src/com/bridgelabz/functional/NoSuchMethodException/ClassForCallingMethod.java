/******************************************************************************
 *  Purpose: Program to throw exception of NoSuchMethodException.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional.NoSuchMethodException;

public class ClassForCallingMethod {
	
	public static void main(String []args) {
		ClassOfTheMethod classOfTheMethod=new ClassOfTheMethod();
		classOfTheMethod.method1();
		classOfTheMethod.method2();
	}

}
