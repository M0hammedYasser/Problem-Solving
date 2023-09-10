package com.java;

import java.security.PublicKey;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1");
		int Num1 =input.nextInt();
		System.out.println("Enter num2");
		int num2 =input.nextInt();
		System.out.println("Enter num3");
		int num3 =input.nextInt();
		
		int sum =greatest(Num1,num2,num3);
		
		System.out.println("greatest is "+sum);



	}
	public static int greatest(int num1,int num2,int num3) {
		
		if(num1>num2 && num1 >num3)
			return num1;
		else if(num2>num1 && num2 >num3)
			return num2;
		else if(num3>num1 && num3 >num2)
			return num3;
		else 
			return 0;
		
		
	}

}
