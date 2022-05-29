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
    final public HashMap<Double, String> tensMap = new HashMap<>();

    public ModernNumbersMap() {
        tensMap.put(100D, "hundred");
        tensMap.put(1000D, "thousand");
        tensMap.put(Math.pow(10, 6), "million");
        tensMap.put(Math.pow(10, 9), "billion");
        tensMap.put(Math.pow(10, 12), "trillion");
        tensMap.put(Math.pow(10, 15), "quadrillion");
        tensMap.put(Math.pow(10, 18), "quintillion");
        tensMap.put(Math.pow(10, 21), "sextillion");
        tensMap.put(Math.pow(10, 24), "septillion");
        tensMap.put(Math.pow(10, 27), "octillion");
        tensMap.put(Math.pow(10, 30), "nonillion");
        tensMap.put(Math.pow(10, 33), "decillion");
        tensMap.put(Math.pow(10, 36), "undecillion");
        tensMap.put(Math.pow(10, 39), "duodecillion");
        tensMap.put(Math.pow(10, 42), "tredecillion");
        tensMap.put(Math.pow(10, 45), "quattuordecillion");
        tensMap.put(Math.pow(10, 48), "quin-decillion");
        tensMap.put(Math.pow(10, 51), "sex-decillion");
        tensMap.put(Math.pow(10, 54), "septen-decillion");
        tensMap.put(Math.pow(10, 57), "octo-decillion");
        tensMap.put(Math.pow(10, 60), "novem-decillion");
        tensMap.put(Math.pow(10, 63), "vigintillion");
        tensMap.put(Math.pow(10, 66), "Unvigintillion");
        tensMap.put(Math.pow(10, 69), "Duovigintillion");
        tensMap.put(Math.pow(10, 72), "Tresvigintillion");
        tensMap.put(Math.pow(10, 75), "Quattuorvigintillion");
        tensMap.put(Math.pow(10, 78), "Quinvigintillion");
        tensMap.put(Math.pow(10, 81), "Sesvigintillion");
        tensMap.put(Math.pow(10, 84), "Septemvigintillion");
        tensMap.put(Math.pow(10, 87), "Octovigintillion");
        tensMap.put(Math.pow(10, 90), "Novemvigintillion");
        tensMap.put(Math.pow(10, 93), "Trigintillion");
        tensMap.put(Math.pow(10, 96), "Untrigintillion");
        tensMap.put(Math.pow(10, 99), "Duotrigintillion");
        tensMap.put(Math.pow(10, 102), "Trestrigintillion");
        tensMap.put(Math.pow(10, 105), "Quattuortrigintillion");
        tensMap.put(Math.pow(10, 108), "Quintrigintillion");
        tensMap.put(Math.pow(10, 111), "Sestrigintillion");
        tensMap.put(Math.pow(10, 114), "Septentrigintillion");
        tensMap.put(Math.pow(10, 117), "Octotrigintillion");
        tensMap.put(Math.pow(10, 120), "Noventrigintillion");
        tensMap.put(Math.pow(10, 123), "Quadragintillion");

    }

    public HashMap<Double, String> getTensMap() {
        return tensMap;
    }

}