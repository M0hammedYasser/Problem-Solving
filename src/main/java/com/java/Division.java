package com.java;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();

		for (int i = 0; i < testCases; i++) {
			int rate = input.nextInt();
			if (rate <= 1399)
				System.out.println("Division 4");
			else if (rate <= 1599 && rate >= 1400)
				System.out.println("Division 3");
			else if (rate <= 1899 && rate >= 1600)
				System.out.println("Division 2");
			else if (rate >= 1900)
				System.out.println("Division 1");

		}

	}

}
