package com.github.dmitrKuznetsov.array;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int[] uniqueArray = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(uniqueArray, 0, nums, 0, uniqueArray.length);

        return uniqueArray.length;
    }
}
