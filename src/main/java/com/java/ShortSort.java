package com.java;

import java.util.Scanner;

public class ShortSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			String s = input.next();
			if(s.charAt(0) =='a' ||s.charAt(1) =='b'||s.charAt(2) =='c')
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
