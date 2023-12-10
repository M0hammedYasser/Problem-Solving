package com.java;

import java.util.Scanner;

public class SpellCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int n = input.nextInt();
			String s = input.next();
			
			if(n!=5)
				System.out.println("NO");
			else {
				if (s.contains("T") 
						&& s.contains("i")
						&& s.contains("m")
						&& s.contains("u")
						&& s.contains("r")
						) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
				
			}
		}
	}
}
