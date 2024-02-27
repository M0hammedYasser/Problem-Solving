package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class EquidistantLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			char[] cs = s.toCharArray();
			Arrays.sort(cs);
			System.out.println(cs);
		}

	}

}
