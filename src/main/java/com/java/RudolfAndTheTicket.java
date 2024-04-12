package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RudolfAndTheTicket {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int m = input.nextInt();
			int k = input.nextInt();
			int counter = 0;
			List<Integer> ns = new ArrayList<>();
			List<Integer> ms = new ArrayList<>();
			for (int j = 0; j < n; j++) 
				ns.add(input.nextInt());
			for (int j = 0; j < m; j++) 
				ms.add(input.nextInt());
			
			
			for (int nn : ns) {
				for(int  mm: ms) {
					if (nn+mm <=k) 
						counter++;
				}
			}
		
			System.out.println(counter);

		}

	}

}
