package com.java;

import java.util.Scanner;

public class TheatreSquare {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double theatreSquareLength = input.nextInt();
        double theatreSquareWeigh = input.nextInt();
        double flagstoneSize = input.nextInt();


        if (flagstoneSize > theatreSquareLength && flagstoneSize > theatreSquareWeigh) {
            System.out.println(1);
        } else {
            double resultLength = Math.ceil(theatreSquareLength / flagstoneSize);

            double resultWeigh = Math.ceil(theatreSquareWeigh / flagstoneSize);

            Long result = (long) (resultLength * resultWeigh);
            System.out.println(result);
        }
    }

}
