package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima {
    static ArrayList<Integer> cards = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCards = input.nextInt();
        int Sereja = 0, Dima = 0;

        for (int i = 0; i < numOfCards; i++) {
            cards.add(input.nextInt());
        }

        while (!cards.isEmpty()) {

            if (cards.get(0) > cards.get(cards.size() - 1)) {
                Sereja += cards.get(0);
                cards.remove(0);
                if (cards.isEmpty())
                    break;
            } else {
                Sereja += cards.get(cards.size() - 1);
                cards.remove(cards.size() - 1);
                if (cards.isEmpty())
                    break;
            }

            if (cards.get(0) > cards.get(cards.size() - 1)) {
                Dima += cards.get(0);
                cards.remove(0);
                if (cards.isEmpty())
                    break;
            } else {
                Dima += cards.get(cards.size() - 1);
                cards.remove(cards.size() - 1);
                if (cards.isEmpty())
                    break;
            }

        }

        System.out.println(Sereja);
        System.out.println(Dima);

    }
}
