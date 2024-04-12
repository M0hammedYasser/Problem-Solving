package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class JugglingLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String string = "";
			for (int j = 0; j < n; j++) {
				String str = input.next();
				string = string.concat(str);
			}
			System.out.println(soloution(string ,n)?"YES":"NO");
		}

	}

	private static boolean soloution(String str , int n) {
		char[]cs = str.toCharArray();
		Arrays.sort(cs);
		int counter =  1;
		for (int i = 0; i < cs.length -1; i++) {
			if (cs[i] == cs[i+1]) 
				counter ++ ;
			else {
				if (!(counter % n == 0)) 
					return false;
				else {
					counter = 1 ;
					continue;
				}
			}
		}
		
		
		return counter % n == 0;
	}

}
