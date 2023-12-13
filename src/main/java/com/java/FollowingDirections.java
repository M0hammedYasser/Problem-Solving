package com.java;

import java.util.Scanner;

public class FollowingDirections {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();

		for (int i = 0; i < test; i++) {
			int x = 0, y = 0;
			int length = scanner.nextInt();
			String s = scanner.next();
			boolean A = false;
			inner: for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == 'U')
					y++;
				else if (s.charAt(j) == 'D')
					y--;
				else if (s.charAt(j) == 'R')
					x++;
				else if (s.charAt(j) == 'L')
					x--;
				if (x == 1 && y == 1) {
					A = true;
					break inner;
				}
				
			}
			if (A) 	System.out.println("YES");
			else  System.out.println("NO");


		}

	}

}
