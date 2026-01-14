package com.hackerpalm.hashmap;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateFinder {

    public static Set<Integer> findDuplicates(List<Integer> list){

        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> strm = list.stream()
                .filter(x->duplicates.add(x)!=true)
                .collect(Collectors.toSet());
        //Testing

        return strm;
    }

    public static List<Integer> duplicateIntegersApproach2(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        Map<Integer, Integer> bucket = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (bucket.containsKey(arr[i])) {
                bucket.put(arr[i], bucket.getOrDefault((arr[i]), 1) + 1);
            }
            bucket.put(arr[i], bucket.getOrDefault((arr[i]), 1));
            // bucket.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> x : bucket.entrySet()) {
            if (x.getValue() > 1) {
                list1.add(x.getKey());
            }
        }
        return list1;
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> list = List.of(1, 2, 3, 2, 4, 5, 3, 6);
        System.out.println("Input : " + list);

        System.out.println("Duplicates 1st approach: " + DuplicateFinder.findDuplicates(list));

        System.out.println("-----------------------------------");

        int[] arr = { 1, 2, 3, 2, 4, 5, 3, 6 };

        System.out.println("Duplicates 2nd approach : " + DuplicateFinder.duplicateIntegersApproach2(arr));

    }



}
