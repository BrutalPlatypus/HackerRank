package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class HurdleRace {

    public static void main(String[] args) {

        /*
            There are n hurdles to jump and you base jump height k, and an unlimited supply of potions that can make you jump
            1 higher.  Given the heights of all the hurdles, what is the minimum number of potions that you need to drink to finish the race?
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            int height = in.nextInt();
            if (height > maxHeight)
                maxHeight = height;
        }
        if (maxHeight > k)
            System.out.println(maxHeight - k);
        else
            System.out.println(0);
    }
}
