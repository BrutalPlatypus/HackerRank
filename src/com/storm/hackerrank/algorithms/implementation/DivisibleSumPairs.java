package com.storm.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {

        /*
            Given an array of n integers a[0], a[1], ... a[n-1], and a positive integer k, find and print the number of
            (i, j) pairs where i < j and a[i] + a[j] is evenly divisible by k ( (a[i] + a[j]) % k == 0 ).
        */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((nums[i] + nums[j]) % k == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);


        //some other guys code with a better answer (O(n) vs O(n^2))

        //each number is sorted into a bucket, where the bucket index corresponds to read % k.  The actual number is not
        //  important, what is important is how many numbers are in the bucket
        //before placing the number into the bucket (actually updating the count in the bucket) we find the bucket who's
        //  index is equal to k - (read % k), aka [this bucket index] + [another index] == k.  All items in [another index],
        //  when added to [this index] will result in a number that is evenly divisible by k.
        //since the numbers in [another index] are already in the list, the requirement of i < j is satisfied, where
        //  [another index] would be i, and [this index] would be j

        //if k == 3 and we have { {3, 6, 9}, {1, 4} , {2}} and read in a 5
        //5 % k == 2, and 1 + 2 == 3, so we want to see how many numbers are in bucket[1]
        //there are 2 numbers in bucket[1] and we can see that (1 + 5) % 3 == 0 and (4 + 5) % 3 == 0
        //so we can add 2 to our current count

        Scanner scan = new Scanner(System.in);
        int n2 = scan.nextInt();
        int k2 = scan.nextInt();

        int [] modBucket = new int[k2];
        int count2 = 0;
        for (int i = 0; i < n2; i++) {
            int read = scan.nextInt();
            int modValue = read % k2;
            int index = (k2 - modValue) % k2;
            count2 += modBucket[index];
            modBucket[modValue]++;
        }

        scan.close();
        System.out.println(count2);
    }
}
