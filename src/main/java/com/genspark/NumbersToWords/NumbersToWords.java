package com.genspark.NumbersToWords;

import com.genspark.NumbersMap.NumbersMap;

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

    void setNumbersMap(NumbersMap numbersMap);

}
