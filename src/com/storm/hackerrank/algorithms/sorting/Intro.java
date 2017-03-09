package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {

        /*
            Given a value V and an n-sized sorted array, output the index of V in the array
        */

        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == v) {
                System.out.println(i);
                break;
            }
        }
    }
}
