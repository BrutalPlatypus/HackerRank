package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort2 {

    /*
        Given an unsorted list of integers, output the integers in order, using the code from CountingSort1.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < size; i++) {
            int j = in.nextInt();
            a[j] = a[j] + 1;
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < a[i]; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
