package com.github.dmitrKuznetsov.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        int[] uniqueNums = Arrays.stream(nums).filter(num -> {
            if (!unique.contains(num)) {
                unique.add(num);
                return true;
            } else {
                return false;
            }
        }).toArray();

        System.arraycopy(uniqueNums, 0, nums, 0, uniqueNums.length);

        return uniqueNums.length;
    }
}
