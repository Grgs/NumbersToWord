package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to traditional long scale European number system.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class LongScaleEuropeanNumbersWords implements NumbersWords {
    /**
     * Names of orders of magnitude.
     * i.e. "hundred", "thousand", "million", etc.
     */
    final public HashMap<Double, String> magnitudeWords = new HashMap<>();

    public LongScaleEuropeanNumbersWords() {
        this.magnitudeWords.put(100D, "hundred");
        this.magnitudeWords.put(1000D, "thousand");
        this.magnitudeWords.put(Math.pow(10, 6), "million");
        this.magnitudeWords.put(Math.pow(10, 9), "millard");
        this.magnitudeWords.put(Math.pow(10, 12), "billion");
        this.magnitudeWords.put(Math.pow(10, 15), "billiard");
        this.magnitudeWords.put(Math.pow(10, 18), "trillion");
        this.magnitudeWords.put(Math.pow(10, 21), "trilliard");
        this.magnitudeWords.put(Math.pow(10, 24), "quadrillion");
        this.magnitudeWords.put(Math.pow(10, 27), "quadrilliard");
        this.magnitudeWords.put(Math.pow(10, 30), "quintillion");
        this.magnitudeWords.put(Math.pow(10, 33), "quintilliard");
        this.magnitudeWords.put(Math.pow(10, 36), "sextillion");
        this.magnitudeWords.put(Math.pow(10, 39), "sextilliard");
        this.magnitudeWords.put(Math.pow(10, 42), "septillion");
        this.magnitudeWords.put(Math.pow(10, 45), "septilliard");
        this.magnitudeWords.put(Math.pow(10, 48), "octillion");
        this.magnitudeWords.put(Math.pow(10, 51), "octilliard");
        this.magnitudeWords.put(Math.pow(10, 54), "nonillion");
        this.magnitudeWords.put(Math.pow(10, 57), "nonilliard");
        this.magnitudeWords.put(Math.pow(10, 60), "decillion");
        this.magnitudeWords.put(Math.pow(10, 63), "decilliard");
        this.magnitudeWords.put(Math.pow(10, 66), "undecillion");
        this.magnitudeWords.put(Math.pow(10, 69), "undecilliard");
        this.magnitudeWords.put(Math.pow(10, 72), "duodecillion");
        this.magnitudeWords.put(Math.pow(10, 75), "duodecilliard");
        this.magnitudeWords.put(Math.pow(10, 78), "tredecillion");
        this.magnitudeWords.put(Math.pow(10, 81), "tredecilliard");
        this.magnitudeWords.put(Math.pow(10, 84), "quattuordecillion");
        this.magnitudeWords.put(Math.pow(10, 87), "quattuordecilliard");
        this.magnitudeWords.put(Math.pow(10, 90), "quindecillion");
        this.magnitudeWords.put(Math.pow(10, 93), "quindecilliard");
        this.magnitudeWords.put(Math.pow(10, 96), "sedecillion");
        this.magnitudeWords.put(Math.pow(10, 99), "sedecilliard");
        this.magnitudeWords.put(Math.pow(10, 102), "septendecillion");
        this.magnitudeWords.put(Math.pow(10, 105), "septendecilliard");
        this.magnitudeWords.put(Math.pow(10, 108), "octodecillion");
        this.magnitudeWords.put(Math.pow(10, 111), "octodecilliard");
        this.magnitudeWords.put(Math.pow(10, 114), "novendecillion");
        this.magnitudeWords.put(Math.pow(10, 117), "novendecilliard");
        this.magnitudeWords.put(Math.pow(10, 120), "vigintillion");
        this.magnitudeWords.put(Math.pow(10, 123), "vigintilliard");

    }

    public HashMap<Double, String> getMagnitudeWords() {
        return magnitudeWords;
    }
}
