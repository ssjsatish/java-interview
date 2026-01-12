package com.hackerpalm.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequencyProblem2 {
    public static void getOccurrances(String word){
        char[] chrWord = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<chrWord.length;i++) {
            if(map.containsKey(chrWord[i])) {
                map.put(chrWord[i], map.getOrDefault(chrWord[i], 1)+1);
            } else {
                map.put(chrWord[i], map.getOrDefault(chrWord[i], 1));
            }
        }
        for(Map.Entry<Character, Integer> x : map.entrySet()) {
            System.out.println("Characters : " +x.getKey()+" and Occurrances : "+x.getValue());
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "banana";
        System.out.println("Input : "+input);
        System.out.println("-------------------------------------");
        System.out.println("Approach 1");
        Map<Character, Long> charCountMap = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(charCountMap);
        System.out.println("-------------------------------------");
        System.out.println("Approach 2");
        CharacterFrequencyProblem2.getOccurrances(input);

    }
}
