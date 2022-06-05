package com.genspark.Converters;

import com.genspark.NumbersMap.Magnitudes;

/**
 * Converts numbers to words.
 */
public interface NumbersToWords {
    /**
     * @return natural language interpretation the number in numberString.
     */
    String getWords();

    void setNumberString(String numberString);

    Magnitudes getMagnitudes();

    void setMagnitudes(Magnitudes magnitudes);

}
