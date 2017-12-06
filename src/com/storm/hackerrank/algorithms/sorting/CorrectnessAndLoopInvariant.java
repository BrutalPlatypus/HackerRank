package com.storm.hackerrank.algorithms.sorting;

import java.util.Scanner;

public class CorrectnessAndLoopInvariant {

    /*
        Find the error in the code
    */

    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            //was only 'j > 0', needed to be '>=' in case the first item in the array was not the smallest item in the list
            while(j >= 0 && A[j] > value){
                A[j + 1] = A[j];
                j = j - 1;
                printArray(A);
            }
            A[j + 1] = value;
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        System.out.println("\n");
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
