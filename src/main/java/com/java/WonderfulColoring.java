package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WonderfulColoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			int red = 0;
			List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			Collections.sort(list);
			int count = groupChars(list).size();
			for (String string : groupChars(list)) {
				if (string.length() > 1) {
					red++;
					count--;
				}
			}
			red+=count/2;

			System.out.println(red);

		}
	}
	private static List<String> groupChars(List<Character> list) {
		List<String> result = new ArrayList<>();
		int count = 1;
		char currentChar = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) == currentChar)
				count++;
			else {
				result.add(String.valueOf(currentChar).repeat(count));
				currentChar = list.get(i);
				count = 1;
			}
		}
		result.add(String.valueOf(currentChar).repeat(count));
		return result;
	}

}
