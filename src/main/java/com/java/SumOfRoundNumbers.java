package com.java;

import java.util.Scanner;

public class SumOfRoundNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int testCase = input.nextInt();
		for (int i = 1; i <= testCase; i++) {
			String num = input.next();
			System.out.println(num.length() - numChar(num));
			for (int j = 0; j < num.length(); j++) {
				if (Integer.parseInt(num.charAt(j) + zero(num.length() - (j + 1))) != 0) {
					System.out.print(num.charAt(j) + zero(num.length() - (j + 1)));
					System.out.println();
				}

			}

		}

	}

	public static int numChar(String name) {
		int count = 0;
		char[] names = name.toCharArray();
		for (int i = 0; i < names.length; i++) {
			if (names[i] == '0') {
				count++;
			}
		}

		return count;
	}

	public static String zero(int num) {
		String name = "";
		for (int i = 0; i < num; i++) {
			name = name + "0";

		}
		return name;
	}

}
