package com.java;

import java.util.Scanner;

public class FileName {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		String a = input.next();
		int xnum = 0, count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'x') {
				xnum++;
			}
			 if (a.charAt(i) != 'x' || (i == n - 1 && a.charAt(i) == 'x')) {
				if (xnum >= 3) {
					count += xnum-2;
					xnum = 0;
				} else
					xnum = 0;
			}

		}

		System.out.println(count );
	}
 
}
 