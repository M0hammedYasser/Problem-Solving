package com.java;

import java.util.Scanner;

public class ShortSubstrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();
		String mid = "" ;
		

		for (int i = 0; i < test; i++) {
			String word = input.next();
			char[] words =word.toCharArray();
			for (int j = 1; j <words.length-1; j+=2) {
				 mid =  mid+words[j]; 
				
			}
			
			System.out.println(words[0] +""+mid+""+words[words.length-1]);
			mid = "";
			
			
		}

	}
}
