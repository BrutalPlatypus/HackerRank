package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine(); //skip first line, we don't need it
        String values = in.nextLine();
        long sum = 0;
        for (String s : values.split(" ")) {
            sum += Long.parseLong(s);
        }
        System.out.println(sum);
    }
}
