package com.storm.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class SockMerchant {

    public static void main(String[] args) {

        /*
            You have a pile of n loose socks where each sock i is labeled c[i], denoting its color.  Two socks, i and j,
            are matching if c[i] == c[j].  How many pairs do you have?
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> c = new ArrayList<>();
        int pairCount = 0;
        for (int i = 0; i < n; i++) {
            Integer next = in.nextInt();
            if (c.remove(next))
                pairCount++;
            else
                c.add(next);
        }
        System.out.println(pairCount);
    }
}
