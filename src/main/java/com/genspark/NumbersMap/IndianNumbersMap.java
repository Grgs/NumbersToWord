package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Map of numbers to words according to the Indian English number system.
 * <a href="https://en.wikipedia.org/wiki/Indian_numbering_system#Names_of_numbers">Indian English names of numbers</a>
 */
@Component
public class IndianNumbersMap implements NumbersMap {

    public HashMap<Double, String> numberMap = new NumberMap().getNumberMap();
    public HashMap<Double, String> tensMap;

    public IndianNumbersMap() {
        this.tensMap = new HashMap<>();
        this.tensMap.put(100D, "hundred");
        this.tensMap.put(1000D, "thousand");
        this.tensMap.put(Math.pow(10, 5), "lakh");
        this.tensMap.put(Math.pow(10, 7), "crore");
        this.tensMap.put(Math.pow(10, 9), "arab");
        this.tensMap.put(Math.pow(10, 11), "kharab");
        this.tensMap.put(Math.pow(10, 13), "nil");
        this.tensMap.put(Math.pow(10, 15), "padma");
        this.tensMap.put(Math.pow(10, 17), "shankh");
    }

    public HashMap<Double, String> getTensMap() {
        return tensMap;
    }
}
