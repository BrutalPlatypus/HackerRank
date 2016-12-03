package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
