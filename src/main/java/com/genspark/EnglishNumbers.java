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
        numberMap.put(Math.pow(10, 6), "million");
        numberMap.put(Math.pow(10, 9), "billion");
        numberMap.put(Math.pow(10, 12), "trillion");
        numberMap.put(Math.pow(10, 15), "quadrillion");
        numberMap.put(Math.pow(10, 18), "quintillion");
        numberMap.put(Math.pow(10, 21), "sextillion");
        numberMap.put(Math.pow(10, 24), "septillion");
        numberMap.put(Math.pow(10, 27), "octillion");
        numberMap.put(Math.pow(10, 30), "nonillion");
        numberMap.put(Math.pow(10, 33), "decillion");
        numberMap.put(Math.pow(10, 36), "undecillion");
        numberMap.put(Math.pow(10, 39), "duodecillion");
        numberMap.put(Math.pow(10, 42), "tredecillion");
        numberMap.put(Math.pow(10, 45), "quattuordecillion");
        numberMap.put(Math.pow(10, 48), "quin-decillion");
        numberMap.put(Math.pow(10, 51), "sex-decillion");
        numberMap.put(Math.pow(10, 54), "septen-decillion");
        numberMap.put(Math.pow(10, 57), "octo-decillion");
        numberMap.put(Math.pow(10, 60), "novem-decillion");
        numberMap.put(Math.pow(10, 63), "vigintillion");
    }

}