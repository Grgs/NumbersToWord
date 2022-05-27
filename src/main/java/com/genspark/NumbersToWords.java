package com.genspark;

/**
 * Converts numbers to words.
 */
public class NumbersToWords implements INumbersToWords {
    /**
     * numberString is the number to be converted to words.
     */
    String numberString;
    EnglishNumbers englishNumbers = new EnglishNumbers();

    NumbersToWords() {
        numberString = "";
    }

    private String getWords(Double number) {
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (englishNumbers.numberMap.containsKey(number) && number < 100) {
            words += englishNumbers.numberMap.get(number);
        } else if (number < 100) {
            words += englishNumbers.numberMap.get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + englishNumbers.numberMap.get(number % 10);
            }
        } else if (number < 1000) {
            words += englishNumbers.numberMap.get(Math.floor(number / 100)) + " " + englishNumbers.numberMap.get(100D);
            if (number % 100 != 0) {
                words += " and " + getWords(number % 100);
            }
        } else {
            int exponent = (int) Math.floor(Math.log10(number) / 3);
            double divisor = Math.pow(10, exponent * 3);
            words += getWords(number / divisor) + " " + englishNumbers.numberMap.get(divisor);
            if (number % divisor != 0) {
                words += " " + getWords(number % divisor);
            }
        }
        return words;
    }

    /**
     * @return natural language interpretation the number in numberString.
     */
    @Override
    public String getWords() {
        return getWords(Double.parseDouble(numberString.replaceAll("[ ,]", "")));
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
