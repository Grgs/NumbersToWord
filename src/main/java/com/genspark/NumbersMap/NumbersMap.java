package com.genspark.NumbersMap;

import java.util.HashMap;

/**
 * Maps numbers to words.
 */
public interface NumbersMap {

    HashMap<Double, String> numberWords = new SmallNumberWords();

    default HashMap<Double, String> getNumberMap() {
        return numberWords;
    }

    HashMap<Double, String> getMagnitudeWords();

}
