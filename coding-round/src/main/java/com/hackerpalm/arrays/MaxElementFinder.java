package com.hackerpalm.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElementFinder {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static List<Integer> maxElementFinderSecondApproach(List<Integer> list){
        return list.stream().sorted((x,y)->y-x).limit(1).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> list = Arrays.asList(8,3,1,4,6,9,0);
        //Top3elementsStreamsProblem6.top3(list);
        System.out.println(MaxElementFinder.maxElementFinderSecondApproach(list));

    }
}
