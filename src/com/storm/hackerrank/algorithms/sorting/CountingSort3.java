package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CountingSort3 {

    /*
        You are given a list that contains both integers and strings. For every value i from 0 to 99, output the number of elements
        that are equal to or less than i.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < size; i++) {
            int j = in.nextInt();
            in.next();  //skip string
            a[j] = a[j] + 1;
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            count += a[i];
            System.out.print(count + " ");
        }
        System.out.println("");
    }
}
