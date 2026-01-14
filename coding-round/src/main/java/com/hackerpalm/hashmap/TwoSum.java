package com.hackerpalm.hashmap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] number, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < number.length; i++) {
            int curr = number[i];

            // curr + need = target
            int need = target - curr;

            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            map.put(curr, i);

        }

        return null;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] res = twoSum(nums, target);

        System.out.println("{" + res[0] + "," + res[1] + "}");

    }

}
