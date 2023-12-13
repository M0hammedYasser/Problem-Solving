package com.java;

import java.util.Scanner;

public class ArrayColoring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		for (int i = 0; i < test; i++) {
			int length = scanner.nextInt();
			int even = 0 ,odd = 0; 
			for (int j = 0; j < length; j++) {
				int n = scanner.nextInt();
				if (n%2 == 0 ) even +=n ;
				else odd +=n ;
			}
			if ((even %2 ==0&&odd %2 == 0)||(even %2 !=0&&odd %2 != 0)) 
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}

	}

}
