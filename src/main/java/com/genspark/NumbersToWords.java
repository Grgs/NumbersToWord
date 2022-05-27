package com.genspark;

public class NumbersToWords implements INumbersToWords {
    String numberString;

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
