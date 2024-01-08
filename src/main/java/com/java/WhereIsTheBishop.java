package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhereIsTheBishop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			List<Integer> list = new ArrayList<Integer>();
			List<String> strings = new ArrayList<>();
			for (int j = 0; j < 8; j++) {
				String s = input.next();
				list.add(countHash(s));
				strings.add(s);
			}
			System.out.println(column(list) + " " +(row(strings.get(column(list) - 1))+1));

		}

	}

	public static int row(String string) {
		return string.indexOf('#');
	}

	public static int countHash(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '#') {
				count++;
			}
		}
		return count;
	}

	public static int column(List<Integer> list) {
		for (int i = 0; i < list.size() - 2; i++) {
			if (list.get(i) == 2 && list.get(i + 1) == 1 && list.get(i + 2) == 2) {
				return i + 2;
			}
		}
		return -1;
	}

}
