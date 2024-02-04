package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsItACat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			System.out.println(handle(s).equals("meow") ? "YES" : "NO");
		}

	}

	private static String handle(String s) {
		s = s.toLowerCase();
		char[] chars = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for (Character character : chars) {
			list.add(character);
		}
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				list.remove(i + 1);
				i--;
			}
		}
		String newString = "";
		for (Character character : list) {
			newString = newString.concat(String.valueOf(character));
		}
		return newString;

	}

}
