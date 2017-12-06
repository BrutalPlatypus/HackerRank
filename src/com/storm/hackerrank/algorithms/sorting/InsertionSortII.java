package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortII {

    /*
        Given an unsorted array, use the same approach as InsertionSortI to sort the entire array.
        Print out the array after each iteration of the insertion-sort, instead of every time you move
        an element.  Since the array composed of just the first element is already sorted, begin printing
        from the second element onwards.
    */

    public static void insertionSortPart2(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j > 0; j--) {
                if (ar[j] < ar[j-1]) {
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                } else {
                    break;
                }
            }
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
