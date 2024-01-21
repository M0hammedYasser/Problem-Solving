package com.java;

import java.util.Scanner;

public class MakeEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long n = input.nextLong();
			int result = -1;

			if (n % 2 == 0)
				result = 0;
			else if (containEven(n)) {
				int index = Integer.parseInt(String.valueOf(String.valueOf(n).charAt(0)));
				result = index % 2 == 0 ? 1 : 2;
			}

	
			System.out.println(result);
		}

	}

	public static boolean containEven(long num) {
		String string = String.valueOf(num);

		for (int i = 0; i < string.length(); i++) {
			if (Integer.parseInt(String.valueOf(string.charAt(i))) % 2 == 0) {
				return true;
			}
		}
		return false;

	}
}
