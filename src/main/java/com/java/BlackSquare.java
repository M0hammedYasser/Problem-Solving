package com.java;

import java.util.Scanner;

public class BlackSquare {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a1, a2, a3, a4, count = 0;
		a1 = input.nextInt();// 1
		a2 = input.nextInt();// 2
		a3 = input.nextInt();// 3
		a4 = input.nextInt();// 4
		String s = input.next();
		char[] ss = s.toCharArray();

		for (int i = 0; i < ss.length; i++) {

			if (ss[i] == '1')
				count += a1;
			if (ss[i] == '2')
				count += a2;
			if (ss[i] == '3')
				count += a3;
			if (ss[i] == '4')
				count += a4;

		}
		System.out.println(count);
	}

}
