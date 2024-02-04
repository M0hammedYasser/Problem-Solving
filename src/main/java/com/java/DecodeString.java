package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int k = 0; k < t; k++) {
			int n = input.nextInt();
			String s = input.next();
			System.out.println(decode(s));

		}
	}

	private static String decode(String string) {
		List<Character> characters = new ArrayList<>();
		for (int i = string.length() - 1; i >= 0; i--) {
			if (string.charAt(i) != '0') {
				int x = Integer.parseInt(String.valueOf(string.charAt(i)));
				characters.add((char) (x + 96));
			} else {
				int z = Integer
						.parseInt(String.valueOf(string.charAt(i - 2)).concat(String.valueOf(string.charAt(i - 1))));
				characters.add((char) (z + 96));
				i -= 2;
			}
		}
		Collections.reverse(characters);
		return  characters.stream()
                .map(e->e.toString())
                .collect(Collectors.joining());
	}
}
