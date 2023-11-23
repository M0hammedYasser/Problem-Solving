package com.java;

import java.util.Scanner;

public class MishkaAndGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfGame = input.nextInt();
		int mishka = 0, chris = 0,count = 0;
		for (int i = 0; i < numOfGame; i++) {
			int x = input.nextInt();
			int y = input.nextInt();

			mishka += x;
			chris += y;
			
			if (x>y) {
				count++;
			}
			else if (x<y) {
				count--;
			}
		}
		
		if (count >0) {
			System.out.println("Mishka");
		}
		else if (count<0) {
			System.out.println("Chris");
		}
		else {
		 {
				System.out.println("Friendship is magic!^^");
			}
			
		}
	}

}
