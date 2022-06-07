package com.github.dmitrKuznetsov;

// https://leetcode.com/problems/roman-to-integer/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        int value = 0;
        List<Roman> complexRoman = new ArrayList<>();
        s.chars().mapToObj(c -> Character.toString(c))
                .filter(str -> Roman.contains(str))
                .forEach(System.out::println);
//        List<Roman> list = s.chars().forEach(System.out::println);
//                .mapToObj(c -> Roman.valueOf(String.valueOf(c)))
//                .collect(Collectors.toList());

//        for (int ii = 0; ii < list.size(); ii++) {
//            if (ii != list.size()-1) {
//                if (list.get(ii+1).value() > list.get(ii).value()) {
//                    complexRoman.add(list.get(ii));
//                    continue;
//                }
//            }
//
//            if (complexRoman.size() > 0) {
//                complexRoman.add(list.get(ii));
//                value += calcComplexRoman(complexRoman);
//                complexRoman.clear();
//            } else {
//                value += list.get(ii).value();
//            }
//        }

        return value;
    }

    private static int calcComplexRoman(List<Roman> complexRoman) {
        int sum = complexRoman.stream().mapToInt(roman -> roman.value())
                .sum();

        return  complexRoman.get(complexRoman.size()-1).value()*2 - sum;
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

        public int value() {
            return this.value;
        }

        public static boolean contains(String s) {
            for (Roman c : Roman.values()) {
                if (c.name().equals(s)) {
                    return true;
                }
            }

            return false;
        }
    }
}
