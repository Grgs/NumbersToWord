package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to traditional long scale British number system.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class TraditionalLongScaleBritishNumbersMap implements NumbersMap {
    final public HashMap<Double, String> tensMap = new HashMap<>();

    public TraditionalLongScaleBritishNumbersMap() {
        this.tensMap.put(100D, "hundred");
        this.tensMap.put(1000D, "thousand");
        this.tensMap.put(Math.pow(10, 6), "million");
        this.tensMap.put(Math.pow(10, 9), "thousand million");
        this.tensMap.put(Math.pow(10, 12), "billion");
        this.tensMap.put(Math.pow(10, 15), "thousand billion");
        this.tensMap.put(Math.pow(10, 18), "trillion");
        this.tensMap.put(Math.pow(10, 21), "thousand trillion");
        this.tensMap.put(Math.pow(10, 24), "quadrillion");
        this.tensMap.put(Math.pow(10, 27), "thousand quadrillion");
        this.tensMap.put(Math.pow(10, 30), "quintillion");
        this.tensMap.put(Math.pow(10, 33), "thousand quintillion");
        this.tensMap.put(Math.pow(10, 36), "sextillion");
        this.tensMap.put(Math.pow(10, 39), "thousand sextillion");
        this.tensMap.put(Math.pow(10, 42), "septillion");
        this.tensMap.put(Math.pow(10, 45), "thousand septillion");
        this.tensMap.put(Math.pow(10, 48), "octillion");
        this.tensMap.put(Math.pow(10, 51), "thousand octillion");
        this.tensMap.put(Math.pow(10, 54), "nonillion");
        this.tensMap.put(Math.pow(10, 57), "thousand nonillion");
        this.tensMap.put(Math.pow(10, 60), "decillion");
        this.tensMap.put(Math.pow(10, 63), "thousand decillion");
        this.tensMap.put(Math.pow(10, 66), "undecillion");
        this.tensMap.put(Math.pow(10, 69), "thousand undecillion");
        this.tensMap.put(Math.pow(10, 72), "duodecillion");
        this.tensMap.put(Math.pow(10, 75), "thousand duodecillion");
        this.tensMap.put(Math.pow(10, 78), "tredecillion");
        this.tensMap.put(Math.pow(10, 81), "thousand tredecillion");
        this.tensMap.put(Math.pow(10, 84), "quattuordecillion");
        this.tensMap.put(Math.pow(10, 87), "thousand quattuordecillion");
        this.tensMap.put(Math.pow(10, 90), "quindecillion");
        this.tensMap.put(Math.pow(10, 93), "thousand quindecillion");
        this.tensMap.put(Math.pow(10, 96), "sedecillion");
        this.tensMap.put(Math.pow(10, 99), "thousand sedecillion");
        this.tensMap.put(Math.pow(10, 102), "septendecillion");
        this.tensMap.put(Math.pow(10, 105), "thousand septendecillion");
        this.tensMap.put(Math.pow(10, 108), "octodecillion");
        this.tensMap.put(Math.pow(10, 111), "thousand octodecillion");
        this.tensMap.put(Math.pow(10, 114), "novendecillion");
        this.tensMap.put(Math.pow(10, 117), "thousand novendecillion");
        this.tensMap.put(Math.pow(10, 120), "vigintillion");
        this.tensMap.put(Math.pow(10, 123), "thousand vigintillion");

    }

    public HashMap<Double, String> getTensMap() {
        return tensMap;
    }
}
