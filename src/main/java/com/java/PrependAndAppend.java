package com.java;

import java.util.Scanner;

public class PrependAndAppend {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt(), count = 0;
			String s = scanner.next();
			inner: for (int j = 0; j < (s.length()) / 2; j++) {
				if ((s.charAt(j) == '0' && s.charAt(Integer.valueOf(s.length() - j - 1)) == '1')
						|| s.charAt(j) == '1' && s.charAt(Integer.valueOf(s.length() - j - 1)) == '0') {
					count += 2;
				} else
					break inner;
			}
			System.out.println(n - count);
		}

	}

}
