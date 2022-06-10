package com.github.dmitrKuznetsov;

// https://leetcode.com/problems/roman-to-integer/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int value = 0;

        List<Integer> list = Arrays.stream(s.split(""))
                .map(r -> Roman.valueOf(r).val())
                .collect(Collectors.toList());

        for (int ii = 0; ii < list.size()-1; ii++) {
            if (list.get(ii+1) > list.get(ii)) {
                value -= list.get(ii);
            } else {
                value += list.get(ii);
            }
        }

        return list.get(list.size()-1) + value;
    }

    enum Roman {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private final int value;

        Roman(int value) {
            this.value = value;
        }

        public int val() {
            return this.value;
        }
    }

}
