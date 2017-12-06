package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort1 {

    /*
        Given a list of integers, output the number of times each value appears.  Every number will be between 0 and 99 (inclusive).
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < size; i++) {
            int j = in.nextInt();
            a[j] = a[j] + 1;
        }

        for(int n : a){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
