package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

/**
 * Map of numbers to words according to the Indian English number system.
 * <a href="https://en.wikipedia.org/wiki/Indian_numbering_system#Names_of_numbers">Indian English names of numbers</a>
 */
@Component
public class IndianNumbersMap extends ModernNumbersMap {
    public IndianNumbersMap() {
        super();
        this.tensMap.remove(Math.pow(10, 9));
        this.tensMap.remove(Math.pow(10, 12));
        this.tensMap.remove(Math.pow(10, 15));
        this.tensMap.remove(Math.pow(10, 18));
        this.tensMap.remove(Math.pow(10, 21));
        this.tensMap.remove(Math.pow(10, 24));
        this.tensMap.remove(Math.pow(10, 27));
        this.tensMap.remove(Math.pow(10, 30));
        this.tensMap.remove(Math.pow(10, 33));
        this.tensMap.remove(Math.pow(10, 36));
        this.tensMap.remove(Math.pow(10, 39));
        this.tensMap.remove(Math.pow(10, 42));
        this.tensMap.remove(Math.pow(10, 45));
        this.tensMap.remove(Math.pow(10, 48));
        this.tensMap.remove(Math.pow(10, 51));
        this.tensMap.remove(Math.pow(10, 54));
        this.tensMap.remove(Math.pow(10, 57));
        this.tensMap.remove(Math.pow(10, 60));
        this.tensMap.remove(Math.pow(10, 63));

        this.tensMap.put(Math.pow(10, 5), "lakh");
        this.tensMap.put(Math.pow(10, 7), "crore");
        this.tensMap.put(Math.pow(10, 9), "arab");
        this.tensMap.put(Math.pow(10, 11), "kharab");
        this.tensMap.put(Math.pow(10, 13), "nil");
        this.tensMap.put(Math.pow(10, 15), "padma");
        this.tensMap.put(Math.pow(10, 17), "shankh");
    }
}
