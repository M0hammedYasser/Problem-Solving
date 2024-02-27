package com.java;

import java.util.Scanner;

public class ArrangingCats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String f = input.next();
			String s = input.next();

			int countF = 0, countS = 0;

			for (int j = 0; j < n; j++) {
				if (f.charAt(j) == '1' && s.charAt(j) == '0')
					countF++;
				if (s.charAt(j) == '1' && f.charAt(j) == '0')
					countS++;
			}

			System.out.println(Math.max(countF, countS));

		}

	}

}
