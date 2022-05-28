package com.genspark;

import java.util.HashMap;

/**
 * list of mappings from numbers to words.
 */
public class ModernNumbers implements IEnglishNumbers {
    public HashMap<Double, String> numberMap;
    public HashMap<Double, String> tensMap;

    ModernNumbers() {
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

        tensMap = new HashMap<>();
        tensMap.put(100D, "hundred");
        tensMap.put(1000D, "thousand");
        tensMap.put(Math.pow(10, 6), "million");
        tensMap.put(Math.pow(10, 9), "billion");
        tensMap.put(Math.pow(10, 12), "trillion");
        tensMap.put(Math.pow(10, 15), "quadrillion");
        tensMap.put(Math.pow(10, 18), "quintillion");
        tensMap.put(Math.pow(10, 21), "sextillion");
        tensMap.put(Math.pow(10, 24), "septillion");
        tensMap.put(Math.pow(10, 27), "octillion");
        tensMap.put(Math.pow(10, 30), "nonillion");
        tensMap.put(Math.pow(10, 33), "decillion");
        tensMap.put(Math.pow(10, 36), "undecillion");
        tensMap.put(Math.pow(10, 39), "duodecillion");
        tensMap.put(Math.pow(10, 42), "tredecillion");
        tensMap.put(Math.pow(10, 45), "quattuordecillion");
        tensMap.put(Math.pow(10, 48), "quin-decillion");
        tensMap.put(Math.pow(10, 51), "sex-decillion");
        tensMap.put(Math.pow(10, 54), "septen-decillion");
        tensMap.put(Math.pow(10, 57), "octo-decillion");
        tensMap.put(Math.pow(10, 60), "novem-decillion");
        tensMap.put(Math.pow(10, 63), "vigintillion");
    }

}