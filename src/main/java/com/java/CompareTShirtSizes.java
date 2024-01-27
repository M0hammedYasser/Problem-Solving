package com.java;

import java.util.Scanner;

public class CompareTShirtSizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String a = input.next();
			String b = input.next();
			char aa = a.charAt(a.length() - 1);
			char bb = b.charAt(b.length() - 1);

			if (aa == bb && (aa == 'M' || aa == 'L'))
				System.out.println(a.length() == b.length() ? '=' : (a.length() > b.length()) ? '>' : '<');
			else if (aa == bb && aa == 'S')
				System.out.println(a.length() == b.length() ? '=' : (a.length() > b.length()) ? '<' : '>');
			else
				System.out.println(compare(aa, bb));
		}
	}

	private static char compare(char aa, char bb) {
		if (aa == bb)
			return '=';
		if (aa == 'L')
			return '>';
		if (bb == 'L')
			return '<';
		if (aa == 'M')
			return '>';
		if (bb == 'M')
			return '<';

		return ' ';
	}

}
