package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Names of orders of magnitude according to the Indian English number system.
 * i.e. "hundred", "thousand", "lakh", etc.
 * <a href="https://en.wikipedia.org/wiki/Indian_numbering_system#Names_of_numbers">Indian English names of numbers</a>
 */
@Component
public class IndianMagnitudes extends HashMap<Double, String> implements Magnitudes {
    /**
     * Add Magnitudes names.
     */
    public IndianMagnitudes() {
        super();
        this.put(100D, "hundred");
        this.put(1000D, "thousand");
        this.put(Math.pow(10, 5), "lakh");
        this.put(Math.pow(10, 7), "crore");
        this.put(Math.pow(10, 9), "arab");
        this.put(Math.pow(10, 11), "kharab");
        this.put(Math.pow(10, 13), "nil");
        this.put(Math.pow(10, 15), "padma");
        this.put(Math.pow(10, 17), "shankh");
    }
}
