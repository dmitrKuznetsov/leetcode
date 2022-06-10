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

        if (k % nums.length == 0) {
            return nums;
        }
        k = k % nums.length;

//        Shiftable shiftable = (int idx, int length, int step) -> {
//            int idx_o = idx;
//            int num_o = nums[idx];
//            int num_n;
//            for (int jj = 0; jj < length; jj++) {
//                int d = idx_o + step;
//                int idx_n = d >= nums.length ? d - nums.length : d;
//                num_n = nums[idx_n];
//                nums[idx_n] = num_o;
//                idx_o = idx_n;
//                num_o = num_n;
//            }
//        };

        if (gcd(nums.length, k) != 1) {
            int n = nums.length / k;
            for (int ii = 0; ii < gcd(nums.length, k); ii++) {  // !!!
                int idx_o = ii;
                int num_o = nums[ii];
                int num_n;
                for (int jj = 0; jj < n - gcd(nums.length, k); jj++) {  // !!!
                    int d = idx_o + k;
                    int idx_n = d >= nums.length ? d - nums.length : d;
                    num_n = nums[idx_n];
                    nums[idx_n] = num_o;
                    idx_o = idx_n;
                    num_o = num_n;
                }
            }
        } else {
            int idx_o = 0;
            int num_o = nums[0];
            int num_n;
            for (int ii = 0; ii < nums.length; ii++) {
                int d = idx_o + k;
                int idx_n = d >= nums.length ? d - nums.length : d;
                num_n = nums[idx_n];
                nums[idx_n] = num_o;
                idx_o = idx_n;
                num_o = num_n;
            }
        }

        return nums;
    }
    private static int gcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    interface Shiftable{
        int shift(int idx, int length, int step);
    }
}
