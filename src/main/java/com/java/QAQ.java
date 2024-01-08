package com.java;

import java.util.Scanner;

public class QAQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String n = input.next();
		String string = "";
		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'Q' || n.charAt(i) == 'A') {
				string = string.concat(String.valueOf(n.charAt(i)));
			}
		}
		for (int i = 0; i < string.length() - 2; i++) {
			for (int j = 1; j < string.length() - 1; j++) {
				for (int k = 2; k < string.length(); k++) {
					if (string.charAt(i) == 'Q' && string.charAt(j) == 'A' && string.charAt(k) == 'Q' && i< j && j <k) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
