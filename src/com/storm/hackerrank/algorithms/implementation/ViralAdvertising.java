package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int totalLikeCount = 0;
        int people = 5;
        for (int i = 0; i < days; i++) {
            people = people / 2;
            totalLikeCount += people;
            people *= 3;
        }
        System.out.println(totalLikeCount);
    }
}
