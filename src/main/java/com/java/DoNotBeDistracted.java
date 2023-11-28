package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DoNotBeDistracted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		for (int i = 0; i < test; i++) {
			int days = input.nextInt();
			String n = input.next();
			if (isSuspicious(rmDif(n)))
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		input.close();

	}

	public static boolean isSuspicious(String n) {
		char[] ns = n.toCharArray();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < ns.length; i++) {
			set.add(ns[i]);
		}
		
		if (set.size()==ns.length) 
			return true;
		else 
			return false;
		
		
		
	}
	
	
	public static String rmDif(String s) {
	    if (s == null || s.length() < 2) 
	        return s;
	    
	    StringBuilder result = new StringBuilder();
	    char previousChar = s.charAt(0);
	    result.append(previousChar);

	    for (int i = 1; i < s.length(); i++) {
	        char currentChar = s.charAt(i);
	        if (currentChar != previousChar) {
	            result.append(currentChar);
	            previousChar = currentChar;
	        }
	    }

	    return result.toString();
	}

}
