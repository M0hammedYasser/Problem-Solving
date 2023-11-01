package com.java.current;

import java.util.Scanner;

public class AntonAndPolyhedrons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;

        for (int i = 0; i <num ; i++) {
            String name = input.next();
            if (name.equals("Tetrahedron"))
                count +=4;
            if (name.equals("Cube"))
                count +=6;
            if (name.equals("Octahedron"))
                count +=8;
            if (name.equals("Dodecahedron"))
                count +=12;
            if (name.equals("Icosahedron"))
                count +=20;
        }
        System.out.println(count);
    }
}
