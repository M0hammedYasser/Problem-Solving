package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BusToUdayland {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean c = true;
		int index = -1;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String s = input.next();
			list.add(s);
			if (s.contains("OO") && c) {
				index = i;
				c = false;
			}
		}
		if (index == -1) {
			System.out.println("NO");
		} else {
			System.out.println("Yes");
			for (int i = 0; i < list.size(); i++) {
				if (i == index) {
					System.out.println(change(list.get(i)));
				} else {
					System.out.println(list.get(i));
				}

			}
		}

	}

	private static String change(String string) {
		char[] chars = string.toCharArray();
		if (chars[0] == 'O' && chars[1] == 'O') {
			chars[0] = '+';
			chars[1] = '+';
		}
		else {
			chars[3] = '+';
			chars[4] = '+';
		}
		return String.valueOf(chars);
	}

}
