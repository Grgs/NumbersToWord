package com.genspark;

/**
 * Converts numbers to words.
 */
public class NumbersToWords implements INumbersToWords {
    /**
     * numberString is the number to be converted to words.
     */
    String numberString;

    /**
     * @return natural language interpretation the number in numberString.
     */
    @Override
    public String getWords() {
        return numberString;
    }

    @Override
    public String getNumberString() {
        return numberString;
    }

    @Override
    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

}
