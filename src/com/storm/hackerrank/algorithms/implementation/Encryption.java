package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        text = text.replaceAll(" ", "");
        int length = text.length();
        int lowerBound = (int) Math.floor(Math.sqrt(length));
        int upperBound = (int) Math.ceil(Math.sqrt(length));
        if (lowerBound * upperBound < length)
            lowerBound = upperBound;
        char[][] encryptionGrid = new char[lowerBound][upperBound];
        for (int i = 0; i < lowerBound; i++) {
            for (int j = 0; j < upperBound; j++) {
                int index = (i * upperBound) + j;
                if (index < text.length()) {
                    char c = text.charAt(index);
                    encryptionGrid[i][j] = c;
                }
            }
        }
        String encrypted = "";
        for (int i = 0; i < upperBound; i++) {
            for (int j = 0; j < lowerBound; j++) {
                char c = encryptionGrid[j][i];
                if (c != ' ' && c != '\u0000')
                    encrypted += c;

            }
            encrypted += " ";
        }
        System.out.println(encrypted);
    }
}
