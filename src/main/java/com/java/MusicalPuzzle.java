package com.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MusicalPuzzle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			Set<String> set = new HashSet<String>();
			for (int j = 0; j < s.length()-1; j++) {
				String ss =s.charAt(j) +""+ s.charAt(j+1);
				set.add(ss);
			}
			System.out.println(set.size());
		}
	}

}
