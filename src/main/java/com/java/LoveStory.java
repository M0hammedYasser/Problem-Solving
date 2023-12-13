package com.java;

import java.util.Scanner;

public class LoveStory {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		String n = "codeforces";

		for (int i = 0; i < test; i++) {
			String s = scanner.next();
			int count =0;
			for (int j = 0; j < n.length(); j++) {
				if (s.charAt(j)!= n.charAt(j)) 
					count++;	
			}
			System.out.println(count);
			
		}

	}

}
