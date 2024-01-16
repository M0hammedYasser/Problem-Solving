package com.java;

import java.util.Scanner;

public class ShortestPathWithObstacle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int xa = input.nextInt();
			int ya = input.nextInt();
			int xb = input.nextInt();
			int yb = input.nextInt();
			int xf = input.nextInt();
			int yf = input.nextInt();
			int result = Math.abs(xb - xa) + Math.abs(yb - ya);
			if ((xf == xa && xf == xb && isBetween(yf, ya, yb))
			||  (yf == ya && yf == yb && isBetween(xf, xa, xb))) 
				result += 2;
			
			System.out.println(result);
		}

	}

	private static boolean isBetween(int b, int y, int x) {
		if ((b > y && b < x) || (b < y && b > x))
			return true;
		return false;

	}

}
