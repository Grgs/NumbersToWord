package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to traditional long scale European number system.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class TraditionalLongScaleEuropeanNumbersMap implements NumbersMap {
    final public HashMap<Double, String> tensMap = new HashMap<>();

    public TraditionalLongScaleEuropeanNumbersMap() {
        this.tensMap.put(100D, "hundred");
        this.tensMap.put(1000D, "thousand");
        this.tensMap.put(Math.pow(10, 6), "million");
        this.tensMap.put(Math.pow(10, 9), "millard");
        this.tensMap.put(Math.pow(10, 12), "billion");
        this.tensMap.put(Math.pow(10, 15), "billiard");
        this.tensMap.put(Math.pow(10, 18), "trillion");
        this.tensMap.put(Math.pow(10, 21), "trilliard");
        this.tensMap.put(Math.pow(10, 24), "quadrillion");
        this.tensMap.put(Math.pow(10, 27), "quadrilliard");
        this.tensMap.put(Math.pow(10, 30), "quintillion");
        this.tensMap.put(Math.pow(10, 33), "quintilliard");
        this.tensMap.put(Math.pow(10, 36), "sextillion");
        this.tensMap.put(Math.pow(10, 39), "sextilliard");
        this.tensMap.put(Math.pow(10, 42), "septillion");
        this.tensMap.put(Math.pow(10, 45), "septilliard");
        this.tensMap.put(Math.pow(10, 48), "octillion");
        this.tensMap.put(Math.pow(10, 51), "octilliard");
        this.tensMap.put(Math.pow(10, 54), "nonillion");
        this.tensMap.put(Math.pow(10, 57), "nonilliard");
        this.tensMap.put(Math.pow(10, 60), "decillion");
        this.tensMap.put(Math.pow(10, 63), "decilliard");
        this.tensMap.put(Math.pow(10, 66), "Undecillion");
        this.tensMap.put(Math.pow(10, 69), "Undecilliard");
        this.tensMap.put(Math.pow(10, 72), "Duodecillion");
        this.tensMap.put(Math.pow(10, 75), "Duodecilliard");
        this.tensMap.put(Math.pow(10, 78), "Tredecillion");
        this.tensMap.put(Math.pow(10, 81), "Tredecilliard");
        this.tensMap.put(Math.pow(10, 84), "Quattuordecillion");
        this.tensMap.put(Math.pow(10, 87), "Quattuordecilliard");
        this.tensMap.put(Math.pow(10, 90), "Quindecillion");
        this.tensMap.put(Math.pow(10, 93), "Quindecilliard");
        this.tensMap.put(Math.pow(10, 96), "Sedecillion");
        this.tensMap.put(Math.pow(10, 99), "Sedecilliard");
        this.tensMap.put(Math.pow(10, 102), "Septendecillion");
        this.tensMap.put(Math.pow(10, 105), "Septendecilliard");
        this.tensMap.put(Math.pow(10, 108), "Octodecillion");
        this.tensMap.put(Math.pow(10, 111), "Octodecilliard");
        this.tensMap.put(Math.pow(10, 114), "Novendecillion");
        this.tensMap.put(Math.pow(10, 117), "Novendecilliard");
        this.tensMap.put(Math.pow(10, 120), "Vigintillion");
        this.tensMap.put(Math.pow(10, 123), "Vigintilliard");

    }

    public HashMap<Double, String> getTensMap() {
        return tensMap;
    }
}
