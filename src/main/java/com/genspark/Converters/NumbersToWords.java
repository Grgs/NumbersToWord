package com.genspark.Converters;

import com.genspark.NumbersMap.NumbersWords;

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

    void setNumbersMap(NumbersWords numbersWords);

}
