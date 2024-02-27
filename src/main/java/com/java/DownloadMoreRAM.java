package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DownloadMoreRAM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			List<Integer> as = new ArrayList<>();
			List<Integer> bs = new ArrayList<>();
			int k = input.nextInt();
			for (int j = 0; j < n; j++) {
				as.add(input.nextInt());
			}
			for (int j = 0; j < n; j++) {
				bs.add(input.nextInt());
			}

			for (int j = 0; j < as.size(); j++) {

				if (k >= as.get(j)) {
					k += bs.get(j);
					as.remove(j);
					bs.remove(j);
					j = -1;
				}

			}

			System.out.println(k);
	
		}

	}

}
