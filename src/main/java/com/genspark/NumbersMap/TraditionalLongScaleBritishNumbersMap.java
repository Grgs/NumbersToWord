package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

/**
 * Map of numbers to words according to traditional long scale British number system.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 *     Dictionary numbers</a>
 */
@Component
public class TraditionalLongScaleBritishNumbersMap extends ModernNumbersMap {
    public TraditionalLongScaleBritishNumbersMap() {
        super();
        this.tensMap.replace(Math.pow(10, 9), "thousand million");
        this.tensMap.replace(Math.pow(10, 12), "billion");
        this.tensMap.replace(Math.pow(10, 15), "thousand billion");
        this.tensMap.replace(Math.pow(10, 18), "trillion");
        this.tensMap.replace(Math.pow(10, 21), "thousand trillion");
        this.tensMap.replace(Math.pow(10, 24), "quadrillion");
        this.tensMap.replace(Math.pow(10, 27), "thousand quadrillion");
        this.tensMap.replace(Math.pow(10, 30), "quintillion");
        this.tensMap.replace(Math.pow(10, 33), "thousand quintillion");
        this.tensMap.replace(Math.pow(10, 36), "sextillion");
        this.tensMap.replace(Math.pow(10, 39), "thousand sextillion");
        this.tensMap.replace(Math.pow(10, 42), "septillion");
        this.tensMap.replace(Math.pow(10, 45), "thousand septillion");
        this.tensMap.replace(Math.pow(10, 48), "octillion");
        this.tensMap.replace(Math.pow(10, 51), "thousand octillion");
        this.tensMap.replace(Math.pow(10, 54), "nonillion");
        this.tensMap.replace(Math.pow(10, 57), "thousand nonillion");
        this.tensMap.replace(Math.pow(10, 60), "decillion");
        this.tensMap.replace(Math.pow(10, 63), "thousand decillion");
    }
}
