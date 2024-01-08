package com.java;

import java.util.Scanner;

public class CipherShifer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			String a = "";
			for (int j = 0; j < s.length(); j++) {
				for (int k = 1; k < s.length(); k++) {
					if (s.charAt(j) == s.charAt(k)) {
						a = a.concat(String.valueOf(s.charAt(j)));
						j=k+1;
						k++;
					}
				}
			}
			System.out.println(a);
		}

	}

}
