package com.hackerpalm.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStringsUsingComma {

    public static String getList(List<String> x){
        String str = x.stream().collect(Collectors.joining(" ; "));
        return str;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("I","love","you","in","every","universe","and","possibility");
        System.out.println("String :- "+ConcatStringsUsingComma.getList(list));

    }
}
