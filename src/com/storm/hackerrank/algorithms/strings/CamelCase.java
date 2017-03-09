package com.storm.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {

        /*
            Determine how many words are in a camel case line
        */

        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.replaceAll("[a-z]", "");
        System.out.println(s.length() + 1);

        //solution I found with streams
        System.out.println(s.chars().filter(Character::isUpperCase).count() + 1);
    }
}
