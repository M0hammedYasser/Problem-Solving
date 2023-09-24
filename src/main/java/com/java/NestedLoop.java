package com.java;



public class NestedLoop {
    public static void main(String[] args) {

        i:
        for (int i = 1; i <= 12; i++) {
            j:
            for (int j = 1; j <= 12; j++) {
                k:
                for (int k = 1; k <=12 ; k++) {
                    System.out.println(i +" * "+j+" * "+k+" = " +(i*j*k));


                }

                System.out.println("------------------");

            }


        }



    }
}