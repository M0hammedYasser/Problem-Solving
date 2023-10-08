package com.java;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = input.nextInt();
		System.out.println("Enter Second Number");
		int num2 = input.nextInt();
		
		try {

		System.out.println(num1/num2);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("You Can't divide By 0 !");
		}
		
		
		
		
		
	}
	

}
