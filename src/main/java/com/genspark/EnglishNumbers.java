package com.genspark;

import java.util.HashMap;

/**
 * list of mappings from numbers to words.
 */
public class EnglishNumbers {
    public HashMap<Double, String> numberMap;

    EnglishNumbers() {
        numberMap = new HashMap<>();
        numberMap.put(0D, "zero");
        numberMap.put(1D, "one");
        numberMap.put(2D, "two");
        numberMap.put(3D, "three");
        numberMap.put(4D, "four");
        numberMap.put(5D, "five");
        numberMap.put(6D, "six");
        numberMap.put(7D, "seven");
        numberMap.put(8D, "eight");
        numberMap.put(9D, "nine");
        numberMap.put(10D, "ten");
        numberMap.put(11D, "eleven");
        numberMap.put(12D, "twelve");
        numberMap.put(13D, "thirteen");
        numberMap.put(14D, "fourteen");
        numberMap.put(15D, "fifteen");
        numberMap.put(16D, "sixteen");
        numberMap.put(17D, "seventeen");
        numberMap.put(18D, "eighteen");
        numberMap.put(19D, "nineteen");
        numberMap.put(20D, "twenty");
        numberMap.put(30D, "thirty");
        numberMap.put(40D, "forty");
        numberMap.put(50D, "fifty");
        numberMap.put(60D, "sixty");
        numberMap.put(70D, "seventy");
        numberMap.put(80D, "eighty");
        numberMap.put(90D, "ninety");
        numberMap.put(100D, "hundred");
        numberMap.put(1000D, "thousand");
        numberMap.put(1000000D, "million");
        numberMap.put(1000000000D, "billion");
        numberMap.put(1000000000000D, "trillion");
        numberMap.put(1000000000000000D, "quadrillion");
        numberMap.put(1000000000000000000D, "quintillion");
        numberMap.put(1000000000000000000000D, "sextillion");
        numberMap.put(1000000000000000000000000D, "septillion");
        numberMap.put(1000000000000000000000000000D, "octillion");
        numberMap.put(1000000000000000000000000000000D, "nonillion");
        numberMap.put(10000000000000000000000000000000000D, "decillion");
        numberMap.put(10000000000000000000000000000000000000D, "undecillion");
    }

}