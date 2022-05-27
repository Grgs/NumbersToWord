package com.genspark;

/**
 * Converts numbers to words.
 */
public interface INumbersToWords {
    /**
     * @return natural language interpretation the number in numberString.
     */
    String getWords();

    String getNumberString();

    void setNumberString(String numberString);
}
