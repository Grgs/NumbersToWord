package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Names of orders of magnitude.
 * i.e. "hundred", "thousand", "million", etc.
 * <a href="https://en.wikipedia.org/wiki/Names_of_large_numbers#Extensions_of_the_standard_dictionary_numbers">
 * Dictionary numbers</a>
 */
@Component
public class ModernMagnitudes extends HashMap<Double, String> implements Magnitudes {
    public ModernMagnitudes() {
        super();
        this.put(100D, "hundred");
        this.put(1000D, "thousand");
        this.put(Math.pow(10, 6), "million");
        this.put(Math.pow(10, 9), "billion");
        this.put(Math.pow(10, 12), "trillion");
        this.put(Math.pow(10, 15), "quadrillion");
        this.put(Math.pow(10, 18), "quintillion");
        this.put(Math.pow(10, 21), "sextillion");
        this.put(Math.pow(10, 24), "septillion");
        this.put(Math.pow(10, 27), "octillion");
        this.put(Math.pow(10, 30), "nonillion");
        this.put(Math.pow(10, 33), "decillion");
        this.put(Math.pow(10, 36), "undecillion");
        this.put(Math.pow(10, 39), "duodecillion");
        this.put(Math.pow(10, 42), "tredecillion");
        this.put(Math.pow(10, 45), "quattuordecillion");
        this.put(Math.pow(10, 48), "quin-decillion");
        this.put(Math.pow(10, 51), "sex-decillion");
        this.put(Math.pow(10, 54), "septen-decillion");
        this.put(Math.pow(10, 57), "octo-decillion");
        this.put(Math.pow(10, 60), "novem-decillion");
        this.put(Math.pow(10, 63), "vigintillion");
        this.put(Math.pow(10, 66), "Unvigintillion");
        this.put(Math.pow(10, 69), "Duovigintillion");
        this.put(Math.pow(10, 72), "Tresvigintillion");
        this.put(Math.pow(10, 75), "Quattuorvigintillion");
        this.put(Math.pow(10, 78), "Quinvigintillion");
        this.put(Math.pow(10, 81), "Sesvigintillion");
        this.put(Math.pow(10, 84), "Septemvigintillion");
        this.put(Math.pow(10, 87), "Octovigintillion");
        this.put(Math.pow(10, 90), "Novemvigintillion");
        this.put(Math.pow(10, 93), "Trigintillion");
        this.put(Math.pow(10, 96), "Untrigintillion");
        this.put(Math.pow(10, 99), "Duotrigintillion");
        this.put(Math.pow(10, 102), "Trestrigintillion");
        this.put(Math.pow(10, 105), "Quattuortrigintillion");
        this.put(Math.pow(10, 108), "Quintrigintillion");
        this.put(Math.pow(10, 111), "Sestrigintillion");
        this.put(Math.pow(10, 114), "Septentrigintillion");
        this.put(Math.pow(10, 117), "Octotrigintillion");
        this.put(Math.pow(10, 120), "Noventrigintillion");
        this.put(Math.pow(10, 123), "Quadragintillion");
    }
}
