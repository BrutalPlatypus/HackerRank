package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2].substring(0, 2));
        String suffix = parts[2].substring(2);
        if (hour == 12)
            hour = 0;
        if (suffix.startsWith("P"))
            hour = hour + 12;
        System.out.println(String.format("%02d:%02d:%02d", hour, minutes, seconds));
    }
}
