package com.github.dmitrKuznetsov.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStock2Test {

    Map<int[], Integer> map = new HashMap<>();

    @BeforeEach
    void init() {
        map.put(
                new int[]{7,1,5,3,6,4},
                7
        );
        map.put(
                new int[]{1,2,3,4,5},
                4
        );
        map.put(
                new int[]{7,6,4,3,1},
                0
        );
        map.put(
                new int[]{2,1,2,0,1},
                2
        );
    }

    @Test
    void maxProfit() {
        for(Map.Entry<int[], Integer> entry : map.entrySet()) {
            int[] prices = entry.getKey();
            int output = entry.getValue();

            int k = BestTimeToBuyAndSellStock2.maxProfit(prices);

            assertEquals(output, k);
        }
    }
}