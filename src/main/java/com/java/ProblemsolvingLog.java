package com.java;

import java.util.Scanner;

public class ProblemsolvingLog {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			int count = 0;
			for (int j = 1; j <= 26; j++) {
				if (numOfChar(s, (char) (j + 64)) >= (int) ((char) (j + 64)) - 64 ) 
					count ++ ;
			}
			System.out.println( count);
		}

	}

	private static int numOfChar(String s, char c) {
		int count = 0;
		for (Character ch : s.toCharArray()) {
			if (ch == c) {
				count++;
			}
		}
		return count;
	}

}
