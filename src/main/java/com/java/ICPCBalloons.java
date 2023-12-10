package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ICPCBalloons {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int len = input.nextInt();
			String s = input.next();
			Set<Character> set = new HashSet<Character>();
			for (int j = 0; j < s.length(); j++) {
				set.add(s.charAt(j));
			}
			int div = len - set.size();

			System.out.println((len*2)-div);

		}

	}

}
