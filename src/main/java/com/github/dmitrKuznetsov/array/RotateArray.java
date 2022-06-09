package com.github.dmitrKuznetsov.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class RotateArray {

    public static int[] rotate(int[] nums, int k) {
//        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
//        Collections.rotate(list, k);
//        return list.stream().mapToInt(i -> i).toArray();
        if (nums.length % k == 0) {
//            int
        } else {
            int idx_o = 0;
            int num_o = nums[0];
            int num_n;
            for (int ii = 0; ii < nums.length; ii++) {
                int d = idx_o + k % nums.length;
                int idx_n = d >= nums.length ? d - nums.length : d;
                num_n = nums[idx_n];
                nums[idx_n] = num_o;
                idx_o = idx_n;
                num_o = num_n;
            }
        }

        return nums;
    }

}
