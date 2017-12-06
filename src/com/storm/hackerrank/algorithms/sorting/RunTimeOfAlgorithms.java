package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class RunTimeOfAlgorithms {

    /*
        Take the solution from InsertionSortII and keep track of the number of shifts that occur while sorting
    */

    public static void insertionRunTime(int[] ar) {
        int shiftCount = 0;
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j-1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                    shiftCount++;
                } else {
                    break;
                }
            }
        }
        System.out.println(shiftCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionRunTime(ar);

    }
}
