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
    public HashMap<Double, String> tensMap;

    public TraditionalLongScaleBritishNumbersMap() {
        this.tensMap = new HashMap<>();
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
        this.tensMap.put(Math.pow(10, 66), "Undecillion");
        this.tensMap.put(Math.pow(10, 69), "Thousand undecillion");
        this.tensMap.put(Math.pow(10, 72), "Duodecillion");
        this.tensMap.put(Math.pow(10, 75), "Thousand duodecillion");
        this.tensMap.put(Math.pow(10, 78), "Tredecillion");
        this.tensMap.put(Math.pow(10, 81), "Thousand tredecillion");
        this.tensMap.put(Math.pow(10, 84), "Quattuordecillion");
        this.tensMap.put(Math.pow(10, 87), "Thousand quattuordecillion");
        this.tensMap.put(Math.pow(10, 90), "Quindecillion");
        this.tensMap.put(Math.pow(10, 93), "Thousand quindecillion");
        this.tensMap.put(Math.pow(10, 96), "Sedecillion");
        this.tensMap.put(Math.pow(10, 99), "Thousand sedecillion");
        this.tensMap.put(Math.pow(10, 102), "Septendecillion");
        this.tensMap.put(Math.pow(10, 105), "Thousand septendecillion");
        this.tensMap.put(Math.pow(10, 108), "Octodecillion");
        this.tensMap.put(Math.pow(10, 111), "Thousand octodecillion");
        this.tensMap.put(Math.pow(10, 114), "Novendecillion");
        this.tensMap.put(Math.pow(10, 117), "Thousand novendecillion");
        this.tensMap.put(Math.pow(10, 120), "Vigintillion");
        this.tensMap.put(Math.pow(10, 123), "Thousand vigintillion");


    }

    public HashMap<Double, String> getTensMap() {
        return tensMap;
    }
}
