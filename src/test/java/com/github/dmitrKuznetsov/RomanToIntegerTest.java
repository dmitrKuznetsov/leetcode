package com.github.dmitrKuznetsov;

import org.junit.jupiter.api.Test;

import static com.github.dmitrKuznetsov.RomanToInteger.romanToInt;
import static org.junit.jupiter.api.Assertions.assertEquals;


class RomanToIntegerTest {

    @Test
    void shouldProperlyGetRoman() {
        assertEquals(3, romanToInt("III"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(1994, romanToInt("MCMXCIV"));
    }
}