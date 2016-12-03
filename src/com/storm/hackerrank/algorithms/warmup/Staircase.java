package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine());
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j < count - i - 1)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
        //found this solution later on, uses String.format() with left padding
        /*String stair = "#";
        final String format = "%" + count + "s\n";
        for(int i = 0; i < count; ++i){
            System.out.print(String.format(format, stair));
            stair += "#";
        }*/
    }
}
