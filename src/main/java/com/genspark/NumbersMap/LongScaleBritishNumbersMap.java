package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to traditional long scale British number system.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class LongScaleBritishNumbersMap implements NumbersMap {
    /**
     * Names of orders of magnitude.
     * i.e. "hundred", "thousand", "million", etc.
     */
    final public HashMap<Double, String> magnitudeWords = new HashMap<>();

    public LongScaleBritishNumbersMap() {
        this.magnitudeWords.put(100D, "hundred");
        this.magnitudeWords.put(1000D, "thousand");
        this.magnitudeWords.put(Math.pow(10, 6), "million");
        this.magnitudeWords.put(Math.pow(10, 9), "thousand million");
        this.magnitudeWords.put(Math.pow(10, 12), "billion");
        this.magnitudeWords.put(Math.pow(10, 15), "thousand billion");
        this.magnitudeWords.put(Math.pow(10, 18), "trillion");
        this.magnitudeWords.put(Math.pow(10, 21), "thousand trillion");
        this.magnitudeWords.put(Math.pow(10, 24), "quadrillion");
        this.magnitudeWords.put(Math.pow(10, 27), "thousand quadrillion");
        this.magnitudeWords.put(Math.pow(10, 30), "quintillion");
        this.magnitudeWords.put(Math.pow(10, 33), "thousand quintillion");
        this.magnitudeWords.put(Math.pow(10, 36), "sextillion");
        this.magnitudeWords.put(Math.pow(10, 39), "thousand sextillion");
        this.magnitudeWords.put(Math.pow(10, 42), "septillion");
        this.magnitudeWords.put(Math.pow(10, 45), "thousand septillion");
        this.magnitudeWords.put(Math.pow(10, 48), "octillion");
        this.magnitudeWords.put(Math.pow(10, 51), "thousand octillion");
        this.magnitudeWords.put(Math.pow(10, 54), "nonillion");
        this.magnitudeWords.put(Math.pow(10, 57), "thousand nonillion");
        this.magnitudeWords.put(Math.pow(10, 60), "decillion");
        this.magnitudeWords.put(Math.pow(10, 63), "thousand decillion");
        this.magnitudeWords.put(Math.pow(10, 66), "undecillion");
        this.magnitudeWords.put(Math.pow(10, 69), "thousand undecillion");
        this.magnitudeWords.put(Math.pow(10, 72), "duodecillion");
        this.magnitudeWords.put(Math.pow(10, 75), "thousand duodecillion");
        this.magnitudeWords.put(Math.pow(10, 78), "tredecillion");
        this.magnitudeWords.put(Math.pow(10, 81), "thousand tredecillion");
        this.magnitudeWords.put(Math.pow(10, 84), "quattuordecillion");
        this.magnitudeWords.put(Math.pow(10, 87), "thousand quattuordecillion");
        this.magnitudeWords.put(Math.pow(10, 90), "quindecillion");
        this.magnitudeWords.put(Math.pow(10, 93), "thousand quindecillion");
        this.magnitudeWords.put(Math.pow(10, 96), "sedecillion");
        this.magnitudeWords.put(Math.pow(10, 99), "thousand sedecillion");
        this.magnitudeWords.put(Math.pow(10, 102), "septendecillion");
        this.magnitudeWords.put(Math.pow(10, 105), "thousand septendecillion");
        this.magnitudeWords.put(Math.pow(10, 108), "octodecillion");
        this.magnitudeWords.put(Math.pow(10, 111), "thousand octodecillion");
        this.magnitudeWords.put(Math.pow(10, 114), "novendecillion");
        this.magnitudeWords.put(Math.pow(10, 117), "thousand novendecillion");
        this.magnitudeWords.put(Math.pow(10, 120), "vigintillion");
        this.magnitudeWords.put(Math.pow(10, 123), "thousand vigintillion");

    }

    public HashMap<Double, String> getMagnitudeWords() {
        return magnitudeWords;
    }
}
