package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {

    public static void main(String[] args) {

        /*
            Grades range from 0-100 inclusive, a grade less than 40 is failing.
            If the difference between grade and the next multiple of 5 is less than 3, round the grade up to the next
            multiple of five.  If the grade is less than 38, no rounding occurs.

            Ex. 84 rounds to 85 but 29 does not round to 30
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int grade = in.nextInt();
            if (grade >= 38) {
                int distanceTo5 = 5 - (grade % 5);
                if (distanceTo5 < 3)
                    grade += distanceTo5;
            }
            System.out.println(grade);
        }
    }
}
