package com.java;

import java.util.Scanner;

public class OrdinaryNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			String n = last(input.next());
			int num = ((n.length()-1)*9) +(Integer.parseInt(String.valueOf( (n.charAt(0)))));
			System.out.println(num);
		}

	}
	public static boolean isOrdinary(String num) {
		if (num.length()==1) return true;
		else {
			for (int i = 0; i < num.length()-1; i++) {
				if (num.charAt(i)==num.charAt(i+1)) continue;
				else return false;
			}
		}
		return true;
	}
	
	public static String last(String num) {
		if (isOrdinary(num)) return num;
		else {
			Long l = Long.parseLong(num);
			
			return last(String.valueOf(v(l)));
		}
			
		
		
	}
	public static String v(long num) {

		String s = String.valueOf(num);
		String newS = "";
		
		for (int i = 0; i < s.length(); i++) {
			newS = newS.concat(String.valueOf(s.charAt(0)));
		}
		
		
		if (Long.parseLong(newS) <= num)
			return newS;
		else {
			newS = "";
			if (s.charAt(0) =='1' ) {
				for (int i = 1; i < s.length(); i++) {
					newS = newS.concat("9");
				}
				return newS;
				
			} 
			else {
				for (int i = 0; i < s.length(); i++) {
					long o = Long.parseLong(String.valueOf(s.charAt(0)));
					newS = newS.concat(String.valueOf(o-1));
				}
				return newS;
			}
			
		}
		

	}
}


/*
 * 1     2      3      4      5      6      7       8        9   
 * 11    22     33     44     55     66     77      88       99   
 * 111   222    333    444    555    666    777     888      999
 * 1111  2222   3333   4444   5555   6666   7777    8888     9999
 * 
 * 
 * */
