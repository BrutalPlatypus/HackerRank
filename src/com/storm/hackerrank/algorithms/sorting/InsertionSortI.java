package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortI {

    /*
        Given a sorted list with an unsorted number e in the rightmost cell, insert e into the array so that it remains
        sorted.  Print the array every time a value is shifted in the array until the array is fully sorted.
    */

    public static void insertIntoSorted(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                a[i] = a[i - 1];
                printArray(a);
                a[i - 1] = temp;
            } else {
                break;
            }
        }
        printArray(a);
    }

    /*The code after here was provided by HackerRank*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
