package com.genspark.NumbersMap;

import java.util.HashMap;

/**
 * Maps numbers to words.
 */
public interface NumbersWords {

    HashMap<Double, String> numberWords = new SmallNumberWords();

    default HashMap<Double, String> getNumberMap() {
        return numberWords;
    }

    HashMap<Double, String> getMagnitudeWords();

}
