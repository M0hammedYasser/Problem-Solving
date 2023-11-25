package com.java;

import java.util.Scanner;

public class CodeforcesChecking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int testCases = input.nextInt();
		String s = "codeforces";
		
		for (int i = 0; i < testCases; i++) {
			String t =input.next();
			
			if (s.contains(t)) 
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		input.close();

	}

}
