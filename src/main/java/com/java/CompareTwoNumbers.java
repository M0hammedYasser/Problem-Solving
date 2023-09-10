package com.java;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number 1");
		int number1 = input.nextInt();
		System.out.println("Enter Number 2");
		int number2 = input.nextInt();
		
		if (number1==number2)
		{
			System.out.println("Number1 = Number2 \n"+ "Number1 ="+number1+" Number1 ="+number2);
		}
		if (number1>number2)
		{
			System.out.println("Number1 != Number2");
			System.out.println("Number1 > Number2 \n"+ "Number1 ="+number1+" Number1 ="+number2);
		}
		if (number1<number2)
		{
			System.out.println("Number1 != Number2");
			System.out.println("Number1 < Number2 \n"+ "Number1 ="+number1+" Number1 ="+number2);
		}
	

	}

}
