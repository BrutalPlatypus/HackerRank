package com.storm.hackerrank.algorithms.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSortI {

    /*
        Given an array, with array[0] being a pivot P, create three arrays, one with all of the
        elements in the original array with values < P, one with the elements where value = P,
        and one with the elements where value > P.  Print out the arrays, in the order listed
        above, on one line.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pivot = in.nextInt();
        int[] a = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            a[i] = in.nextInt();
        }

        splitAndPrint(pivot, a);
    }

    public static void splitAndPrint(int pivot, int[] a) {
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();

        same.add(pivot);

        for (int i : a) {
            if (i < pivot)
                smaller.add(i);
            else if (i == pivot)
                same.add(i);
            else
                greater.add(i);
        }

        printArray(smaller, same, greater);
    }


    private static void printArray(ArrayList<Integer>... a) {
        for (ArrayList<Integer> ints : a) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
