package com.hackerpalm.hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapProblem {
    public static List<String> getFlatMap(List<List<String>> listOfString){

        return listOfString.stream().flatMap((List<String> x)->x.stream()).collect(Collectors.toList());
    }


    public static void main(String[] args) {
        List<List<String>> sentence
                = Arrays.asList(Arrays.asList("I","AM","SANJIBAN"),
                Arrays.asList("I","KNOW","I","AM","OBNOXIOUS")
        );
        System.out.println("List of Lists : "+sentence);
        System.out.println("---------------------------------");
        //FlatMapPropblem5.convert(sentence);
        System.out.println("FlatMap : "+FlatMapProblem.getFlatMap(sentence));

    }
}
