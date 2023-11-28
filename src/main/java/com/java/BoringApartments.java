package com.java;

import java.util.Scanner;

public class BoringApartments {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int test = input.nextInt();

		for (int i = 0; i < test; i++) {
			int count =0;
			String num = input.next();
			
			for (int j = 2; j <=9; j++) {
				if(num.contains(Integer.toString(j)))
					count+=(j-1)*10;
			}

			if (num.length()==1) 
				count+=1;
			else if (num.length()==2) 
				count+=3;
			else if (num.length()==3) 
				count+=6;
			else if (num.length()==4) 
				count+=10;
			
			System.out.println(count);
		}
		
	
		
		input.close();

	}

}
