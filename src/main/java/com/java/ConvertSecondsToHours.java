package com.java;

import java.util.Scanner;

public class ConvertSecondsToHours {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter second");
		int second = input.nextInt();
		int S = second % 60;
	    int H = second / 60;
	    int M = H % 60;
	    H = H / 60;
	    System.out.print( H + ":" + M + ":" + S);
		


	}

}
