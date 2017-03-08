package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
