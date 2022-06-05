package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to the Indian English number system.
 * <a href="https://en.wikipedia.org/wiki/Indian_numbering_system#Names_of_numbers">Indian English names of numbers</a>
 */
@Component
public class IndianNumbersMap implements NumbersMap {
    /**
     * Names of orders of magnitude.
     * i.e. "hundred", "thousand", "lakh", etc.
     */
    final public HashMap<Double, String> magnitudeWords = new HashMap<>();

    public IndianNumbersMap() {
        this.magnitudeWords.put(100D, "hundred");
        this.magnitudeWords.put(1000D, "thousand");
        this.magnitudeWords.put(Math.pow(10, 5), "lakh");
        this.magnitudeWords.put(Math.pow(10, 7), "crore");
        this.magnitudeWords.put(Math.pow(10, 9), "arab");
        this.magnitudeWords.put(Math.pow(10, 11), "kharab");
        this.magnitudeWords.put(Math.pow(10, 13), "nil");
        this.magnitudeWords.put(Math.pow(10, 15), "padma");
        this.magnitudeWords.put(Math.pow(10, 17), "shankh");
    }

    public HashMap<Double, String> getMagnitudeWords() {
        return magnitudeWords;
    }
}
