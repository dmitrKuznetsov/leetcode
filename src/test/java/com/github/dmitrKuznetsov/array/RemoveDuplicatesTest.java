package com.github.dmitrKuznetsov.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    Map<int[], int[]> map = new HashMap<>();

    @BeforeEach
    void init() {
        map.put(
            new int[]{1,1,2},
            new int[]{1,2}
        );

        map.put(
            new int[]{0,0,1,1,1,2,2,3,3,4},
            new int[]{0,1,2,3,4}
        );

        map.put(
            new int[]{0,0,1,1,2,2,3,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
            new int[]{0,1,2,3,4,5}
        );

        map.put(
            new int[]{0,0,1,1,2,2,3,3,4,5,5,6,6,6,6,8,8,8,8},
            new int[]{0,1,2,3,4,5,6,8}
        );
    }

    @Test
    void shouldCorrectRemoveDuplicates() {
        for(Map.Entry<int[], int[]> entry : map.entrySet()) {
            int[] nums = entry.getKey();
            int[] expectedNums = entry.getValue();

//            System.out.println(Arrays.toString(nums));
            int k = RemoveDuplicates.removeDuplicates(nums);
//            System.out.println(Arrays.toString(nums));

            assertEquals(expectedNums.length, k);
            for (int ii = 0; ii < k; ii++) {
                assertEquals(expectedNums[ii], nums[ii]);
            }
        }
    }
}