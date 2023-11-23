package com.java;

import java.util.Scanner;

public class ArrivalOfTheGeneral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int size = input.nextInt();
		int max = 0, min = 101, indexMax = -1, indexMin = -1;

		for (int i = 1; i <= size; i++) {
			int soldiersHeights = input.nextInt();
			if (soldiersHeights > max) {
				max = soldiersHeights;
				indexMax = i;
			}
			if (soldiersHeights <= min) {
				min = soldiersHeights;
				indexMin = i;
			}

		}

		if (indexMax > indexMin) {
			System.out.println((indexMax - 1) + (size - indexMin) - 1);
		} else
			System.out.println((indexMax - 1) + (size - indexMin));

		input.close();
	}

}
