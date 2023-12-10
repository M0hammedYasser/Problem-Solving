package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiftsFixing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			List<Long> lista = new ArrayList<>();
			List<Long> listb = new ArrayList<>();
			long count = 0;
			int n = input.nextInt();
			for (int j = 0; j < n; j++) {
				long a = input.nextLong();
				lista.add(a);
			}

			for (int j = 0; j < n; j++) {
				long b = input.nextInt();
				listb.add(b);
			}

			for (int j = 0; j < n; j++) {
				if (lista.get(j) > min(lista) && listb.get(j) > min(listb)) {
					count += (lista.get(j) - min(lista));
					count += (listb.get(j) - min(listb));
					long div = Math.min(((lista.get(j) - min(lista))), ((listb.get(j) - min(listb))));
					count -= div;
				}

				else {
					if (lista.get(j) > min(lista))
						count += (lista.get(j) - min(lista));
					if (listb.get(j) > min(listb))
						count += (listb.get(j) - min(listb));
				}

			}

			System.out.println(count);

		}
	}

	public static long min(List<Long> array) {
		Long min = array.get(0);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) < min)
				min = array.get(i);
		}
		return min;

	}
}
