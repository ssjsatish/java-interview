package com.hackerpalm.arrays;

public class MissingNumber {
    public static int missingNumber(int[] arr, int n) {
        /* Sum  of 1->n is n(n+1)/2 */
        int actualSum = 0;
        for(int i = 0;i<n-1;i++) {
            actualSum = actualSum+ arr[i];
        }
        int expectedSum = n * (n+1) / 2;
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {1,2,4,5};
        System.out.println(MissingNumber.missingNumber(array, 5));

    }
}
