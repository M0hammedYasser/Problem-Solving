package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class FindAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			System.out.println(isBinary(s) ? "YES " : "NO");
		}
	}

	private static boolean isBinary(String s) {
		if (distinct(s) == s.length())
			return true;

		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)))
					return false;
			}
		}
		return true;
	}

	private static int distinct(String s) {
		Set<Character> set = new HashSet<>(s.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
		return set.size();
	}
}
/*
 * for (int i = 0; i < s.length()-1; i++) { if (s.charAt(i) == s.charAt(i + 1))
 * { return false; } }
 */