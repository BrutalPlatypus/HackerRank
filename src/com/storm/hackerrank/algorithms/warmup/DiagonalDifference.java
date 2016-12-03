package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < size; i++) {
            aSum += matrix[i][i];
            bSum += matrix[i][size - (i + 1)];
        }
        System.out.println(Math.abs(aSum - bSum));
    }
}
