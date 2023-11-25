package com.java;

import java.util.Scanner;

public class DieRoll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int y = input.nextInt();
		int w = input.nextInt();
		int max = Integer.max(y, w);
		double reault = 7 - max;

		if (reault == 6)
			System.out.println("1/1");
		if (reault == 5)
			System.out.println("5/6");
		if (reault == 4)
			System.out.println("2/3");
		if (reault == 3)
			System.out.println("1/2");
		if (reault == 2)
			System.out.println("1/3");
		if (reault == 1) 
			System.out.println("1/6");

	}

}
