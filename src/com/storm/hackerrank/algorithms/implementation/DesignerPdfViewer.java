package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] letterHeights = new int[26];
        for (int i = 0; i < 26; i++) {
            letterHeights[i] = in.nextInt();
        }
        String word = in.next();
        int maxHeight = 0;
        for (char c : word.toCharArray()) {
            int height = letterHeights[(int)c - (int)'a'];
            maxHeight = Math.max(maxHeight, height);
        }
        System.out.println(maxHeight * word.length());
    }
}
