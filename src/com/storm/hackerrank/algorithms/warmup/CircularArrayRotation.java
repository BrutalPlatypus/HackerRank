package com.storm.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int rotationCount = in.nextInt() % size;
        int queries = in.nextInt();
        int[] a = new int[size];
        for(int i=0; i < size; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < queries; i++){
            int searchIndex = in.nextInt();
            //right shifting the array N times means putting the last N elements of the array to the front
            //so to (size - rotationCount) would give us the "new" 0th index of the rotated array.
            //add the search index to that and use modulus to keep us within bounds to find the proper offset
            //this link helped me http://www.codeinjava.com/2015/06/circular-shifting-of-elements-in-arrays-java.html
            System.out.println(a[(size - rotationCount + searchIndex) % size] );
        }
    }
}
