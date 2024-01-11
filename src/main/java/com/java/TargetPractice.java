package com.java;

import java.util.Scanner;

public class TargetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int count = 0;
			for (int j = 0; j < 10; j++) {
				String a = input.next();
				for (int k = 0; k < a.length(); k++) {
					if (a.charAt(k) == 'X') {
						count += valueOfX(j, k);
					}
				}

			}
			System.out.println(count);
		}
	}

	public static int valueOfX(int x, int y) {
		if (x == 0 || x == 9 || (x > 0 && y == 0) || (x > 0 && y == 9))
			return 1;
		if ((x == 1 && y >= 1) || (y == 1 && x >= 1) || (y == 8 && x >= 1) || (x == 8 && y >= 1)) {
			return 2;
		}
		if ((x == 2 && y >= 2) || (y == 2 && x >= 2) || (y == 7 && x >= 2) || (x == 7 && y >= 2)) {
			return 3;
		}
		if ((x == 3 && y >= 3) || (y == 3 && x >= 3) || (y == 6 && x >= 3) || (x == 6 && y >= 3)) {
			return 4;
		}

		return 5;

	}

}
