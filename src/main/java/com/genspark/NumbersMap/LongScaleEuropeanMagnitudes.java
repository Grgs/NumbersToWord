package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Names of orders of magnitude according to traditional long scale European number system.
 * i.e. "hundred", "thousand", "million", "millard", etc.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class LongScaleEuropeanMagnitudes extends HashMap<Double, String> implements Magnitudes {
    public LongScaleEuropeanMagnitudes() {
        super();
        this.put(100D, "hundred");
        this.put(1000D, "thousand");
        this.put(Math.pow(10, 6), "million");
        this.put(Math.pow(10, 9), "millard");
        this.put(Math.pow(10, 12), "billion");
        this.put(Math.pow(10, 15), "billiard");
        this.put(Math.pow(10, 18), "trillion");
        this.put(Math.pow(10, 21), "trilliard");
        this.put(Math.pow(10, 24), "quadrillion");
        this.put(Math.pow(10, 27), "quadrilliard");
        this.put(Math.pow(10, 30), "quintillion");
        this.put(Math.pow(10, 33), "quintilliard");
        this.put(Math.pow(10, 36), "sextillion");
        this.put(Math.pow(10, 39), "sextilliard");
        this.put(Math.pow(10, 42), "septillion");
        this.put(Math.pow(10, 45), "septilliard");
        this.put(Math.pow(10, 48), "octillion");
        this.put(Math.pow(10, 51), "octilliard");
        this.put(Math.pow(10, 54), "nonillion");
        this.put(Math.pow(10, 57), "nonilliard");
        this.put(Math.pow(10, 60), "decillion");
        this.put(Math.pow(10, 63), "decilliard");
        this.put(Math.pow(10, 66), "undecillion");
        this.put(Math.pow(10, 69), "undecilliard");
        this.put(Math.pow(10, 72), "duodecillion");
        this.put(Math.pow(10, 75), "duodecilliard");
        this.put(Math.pow(10, 78), "tredecillion");
        this.put(Math.pow(10, 81), "tredecilliard");
        this.put(Math.pow(10, 84), "quattuordecillion");
        this.put(Math.pow(10, 87), "quattuordecilliard");
        this.put(Math.pow(10, 90), "quindecillion");
        this.put(Math.pow(10, 93), "quindecilliard");
        this.put(Math.pow(10, 96), "sedecillion");
        this.put(Math.pow(10, 99), "sedecilliard");
        this.put(Math.pow(10, 102), "septendecillion");
        this.put(Math.pow(10, 105), "septendecilliard");
        this.put(Math.pow(10, 108), "octodecillion");
        this.put(Math.pow(10, 111), "octodecilliard");
        this.put(Math.pow(10, 114), "novendecillion");
        this.put(Math.pow(10, 117), "novendecilliard");
        this.put(Math.pow(10, 120), "vigintillion");
        this.put(Math.pow(10, 123), "vigintilliard");
    }
}
