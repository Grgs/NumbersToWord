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

    /**
     * Set the number to be converted to words.
     *
     * @param numberString The number to be converted to words.
     */
    void setNumberString(String numberString);

    /**
     * Get the magnitude map.
     *
     * @return Map of magnitude names to their values.
     */
    Magnitudes getMagnitudes();

    /**
     * Set the magnitude map.
     *
     * @param magnitudes Map magnitude names to values.
     */
    void setMagnitudes(Magnitudes magnitudes);
}
