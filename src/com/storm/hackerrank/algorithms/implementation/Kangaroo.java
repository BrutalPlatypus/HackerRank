package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
        //we need to solve for X in the equation v1X + x1 = v2X + x2
        //to determine what value of X the two kangaroos will meet up at
        //if X is negative, they will never meet up
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        if (v2 - v1 == 0) //denominator = 0
            System.out.println("NO");
        else {
            //need to cast to double to properly get decimal places
            double x = ((double)(x1 - x2) / (v2 - v1));
            System.out.println(x % 1 == 0 && x > 0 ? "YES" : "NO");
        }
    }
}
