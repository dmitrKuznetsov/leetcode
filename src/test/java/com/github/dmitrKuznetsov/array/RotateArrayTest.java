package com.github.dmitrKuznetsov.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    @Test
    void shouldCorrectRotate() {
        int[] nums = {1,2,3,4,5,6,7};

        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 1),
                new int[]{ 7, 1, 2, 3, 4, 5, 6 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 2),
                new int[]{ 6, 7, 1, 2, 3, 4, 5 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 3),
                new int[]{ 5, 6, 7, 1, 2, 3, 4 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 7),
                new int[]{ 1, 2, 3, 4, 5, 6, 7 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 0),
                new int[]{ 1, 2, 3, 4, 5, 6, 7 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 14),
                new int[]{ 1, 2, 3, 4, 5, 6, 7 }
        );
        assertArrayEquals(
                RotateArray.rotate(Arrays.copyOf(nums, nums.length), 8),
                new int[]{ 7, 1, 2, 3, 4, 5, 6 }
        );
        assertArrayEquals(
                RotateArray.rotate(new int[]{1,2,3,4,5,6}, 4),
                new int[]{ 3,4,5,6,1,2 }
        );
    }
}