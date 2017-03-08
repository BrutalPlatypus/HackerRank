package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {

        /*
            A tree goes through 2 growth cycles every year.  In spring, it doubles in height, and in summer it's height
            grows by 1 meter.

            A tree with a height of 1 meter is planted right before sprint.  How tall will it be after n growth cycles?
        */

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = in.nextInt();
            int height = 1;
            for (int j = 1; j <= n; j++) {
                if ((j % 2) == 1)
                    height *= 2;
                else
                    height += 1;
            }
            System.out.println(height);
        }
    }
}
