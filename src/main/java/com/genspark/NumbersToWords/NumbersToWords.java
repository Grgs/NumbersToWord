package com.genspark.NumbersToWords;

/**
 * Converts numbers to words.
 */
public interface NumbersToWords {
    /**
     * @return natural language interpretation the number in numberString.
     */
    String getWords();

    String getNumberString();

    void setNumberString(String numberString);
}
