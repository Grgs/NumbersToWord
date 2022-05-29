package com.genspark.NumbersMap;

import java.util.HashMap;

/**
 * Maps numbers to words.
 */
public interface NumbersMap {

    HashMap<Double, String> numberMap = new NumberMap().getNumberMap();
    HashMap<Double, String> tensMap = new HashMap<>();

    default HashMap<Double, String> getNumberMap() {
        return numberMap;
    }

    HashMap<Double, String> getTensMap();

}
