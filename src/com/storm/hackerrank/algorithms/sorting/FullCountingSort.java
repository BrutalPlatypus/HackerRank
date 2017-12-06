package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class FullCountingSort {

    /*
        Given a list of integers and strings, print the strings in order of their accompanying integers.  If the integers
        for two strings are equal, ensure that they are printed in the order they appeared in the original list.

        TWIST - Print a dash for any element from the first half of the original array, instead of the associated String.
    */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        StringBuilder[] strings = new StringBuilder[100];
        for (int i = 0; i < 100; i++) {
            strings[i] = new StringBuilder("");
        }
        for (int i = 0; i < size; i++) {
            int j = in.nextInt();
            String next = in.next();
            String s;
            if (i < size / 2) {
                s = "- ";
            } else {
                s = next + " ";
            }
            strings[j] = strings[j].append(s);
        }

        StringBuilder builder = new StringBuilder();
        for (StringBuilder s : strings) {
            builder.append(s);
        }
        System.out.println(builder.toString());
    }
}
