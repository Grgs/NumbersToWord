package com.genspark.NumbersMap;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * list of mappings from numbers to words according to western modern number systems.
 */
@Component
@Primary
public class ModernNumbersMap implements NumbersMap {
    /**
     * Names of orders of magnitude.
     * i.e. "hundred", "thousand", "million", etc.
     */
    final public HashMap<Double, String> magnitudeWords = new HashMap<>();

    public ModernNumbersMap() {
        magnitudeWords.put(100D, "hundred");
        magnitudeWords.put(1000D, "thousand");
        magnitudeWords.put(Math.pow(10, 6), "million");
        magnitudeWords.put(Math.pow(10, 9), "billion");
        magnitudeWords.put(Math.pow(10, 12), "trillion");
        magnitudeWords.put(Math.pow(10, 15), "quadrillion");
        magnitudeWords.put(Math.pow(10, 18), "quintillion");
        magnitudeWords.put(Math.pow(10, 21), "sextillion");
        magnitudeWords.put(Math.pow(10, 24), "septillion");
        magnitudeWords.put(Math.pow(10, 27), "octillion");
        magnitudeWords.put(Math.pow(10, 30), "nonillion");
        magnitudeWords.put(Math.pow(10, 33), "decillion");
        magnitudeWords.put(Math.pow(10, 36), "undecillion");
        magnitudeWords.put(Math.pow(10, 39), "duodecillion");
        magnitudeWords.put(Math.pow(10, 42), "tredecillion");
        magnitudeWords.put(Math.pow(10, 45), "quattuordecillion");
        magnitudeWords.put(Math.pow(10, 48), "quin-decillion");
        magnitudeWords.put(Math.pow(10, 51), "sex-decillion");
        magnitudeWords.put(Math.pow(10, 54), "septen-decillion");
        magnitudeWords.put(Math.pow(10, 57), "octo-decillion");
        magnitudeWords.put(Math.pow(10, 60), "novem-decillion");
        magnitudeWords.put(Math.pow(10, 63), "vigintillion");
        magnitudeWords.put(Math.pow(10, 66), "Unvigintillion");
        magnitudeWords.put(Math.pow(10, 69), "Duovigintillion");
        magnitudeWords.put(Math.pow(10, 72), "Tresvigintillion");
        magnitudeWords.put(Math.pow(10, 75), "Quattuorvigintillion");
        magnitudeWords.put(Math.pow(10, 78), "Quinvigintillion");
        magnitudeWords.put(Math.pow(10, 81), "Sesvigintillion");
        magnitudeWords.put(Math.pow(10, 84), "Septemvigintillion");
        magnitudeWords.put(Math.pow(10, 87), "Octovigintillion");
        magnitudeWords.put(Math.pow(10, 90), "Novemvigintillion");
        magnitudeWords.put(Math.pow(10, 93), "Trigintillion");
        magnitudeWords.put(Math.pow(10, 96), "Untrigintillion");
        magnitudeWords.put(Math.pow(10, 99), "Duotrigintillion");
        magnitudeWords.put(Math.pow(10, 102), "Trestrigintillion");
        magnitudeWords.put(Math.pow(10, 105), "Quattuortrigintillion");
        magnitudeWords.put(Math.pow(10, 108), "Quintrigintillion");
        magnitudeWords.put(Math.pow(10, 111), "Sestrigintillion");
        magnitudeWords.put(Math.pow(10, 114), "Septentrigintillion");
        magnitudeWords.put(Math.pow(10, 117), "Octotrigintillion");
        magnitudeWords.put(Math.pow(10, 120), "Noventrigintillion");
        magnitudeWords.put(Math.pow(10, 123), "Quadragintillion");

    }

    public HashMap<Double, String> getMagnitudeWords() {
        return magnitudeWords;
    }

}