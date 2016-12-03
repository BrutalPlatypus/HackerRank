package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        int positive = 0;
        int negative = 0;
        int zeroes = 0;
        for (String s : in.nextLine().split(" ")) {
            int i = Integer.parseInt(s);
            if (i > 0)
                positive++;
            else if (i < 0)
                negative++;
            else
                zeroes++;
        }
        System.out.println((double)positive / count);
        System.out.println((double)negative / count);
        System.out.println((double)zeroes / count);
    }
}
