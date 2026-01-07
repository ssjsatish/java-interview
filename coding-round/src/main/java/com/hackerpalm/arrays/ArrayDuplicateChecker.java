package com.hackerpalm.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateChecker {
    public static boolean hasDuplicate(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        Set<Integer> seen = new HashSet<>();

        for (int n : numbers) {
            if (seen.contains(n)) {
                return true;
            }
            seen.add(n);
        }

        return false;
    }
}
