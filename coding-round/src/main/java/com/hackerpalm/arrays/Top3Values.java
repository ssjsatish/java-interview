package com.hackerpalm.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Top3Values {
    public static List<Integer> getTop3Values(List<Integer> list){
        return list.stream().sorted((x,y)->y-x).limit(3).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(8,3,1,4,6,9,0);
        System.out.println("Top 3 elements : "+Top3Values.getTop3Values(list));
    }
}
