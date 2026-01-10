package com.hackerpalm.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateFinder {

    public static Set<Integer> findDuplicates(List<Integer> list){

        Set<Integer> duplicates = new HashSet<>();

        Set<Integer> strm = list.stream()
                .filter(x->duplicates.add(x)!=true)
                .collect(Collectors.toSet());

        return strm;
    }



}
