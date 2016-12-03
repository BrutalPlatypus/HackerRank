package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i < testCase; i++) {
            int prisoners = in.nextInt();
            int sweets = in.nextInt();
            int start = in.nextInt();
            int poisoned = (sweets + start - 1) % prisoners;
            System.out.println(poisoned == 0 ? prisoners : poisoned);
        }
    }
}
