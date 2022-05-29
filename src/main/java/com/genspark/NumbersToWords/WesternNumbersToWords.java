package com.genspark.NumbersToWords;

import com.genspark.NumbersMap.ModernNumbersMap;
import com.genspark.NumbersMap.NumbersMap;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Converts numbers to words.
 */
@Component
@Primary
public class WesternNumbersToWords implements NumbersToWords {
    /**
     * numberString is the number to be converted to words.
     */
    String numberString = "";

    /**
     * numbersMap is the map of numbers to words.
     */
    NumbersMap numbersMap;

    public WesternNumbersToWords() {
    }

    public WesternNumbersToWords(NumbersMap numbersMap) {
        numberString = "";
        this.numbersMap = numbersMap;
    }

    public void setNumbersMap(NumbersMap numbersMap) {
        this.numbersMap = numbersMap;
    }

    public String getWords(Double number) {
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (numbersMap.getNumberMap().containsKey(number)) {
            words += numbersMap.getNumberMap().get(number);
        } else if (number < 100) {
            words += numbersMap.getNumberMap().get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + numbersMap.getNumberMap().get(Math.floor(number) % 10);
            }
        } else if (number < 1000) {
            words += numbersMap.getNumberMap().get(Math.floor(number / 100)) + " " + numbersMap.getTensMap().get(100D);
            if (number % 100 != 0) {
                words += " and " + getWords(number % 100);
            }
        } else {
            int exponent = (int) Math.floor(Math.log10(number) / 3);
            double divisor = Math.pow(10, exponent * 3);
            words += getWords(Math.floor(number / divisor)) + " " + numbersMap.getTensMap().get(divisor);
            if (number % divisor != 0) {
                words += " " + getWords(number % divisor);
            }
        }
        return words;
    }

    private String getWordsFraction(double fraction) {
        StringBuilder words = new StringBuilder();
        String fractionString = String.format("%f", fraction);
        String[] fractionChars = fractionString.split("\\.")[1].replaceFirst("0*$", "").
                split("");
        for (String fractionChar : fractionChars) {
            words.append(" ").append(numbersMap.getNumberMap().get(Double.parseDouble(fractionChar)));
        }
        return words.toString().strip();
    }

    /**
     * @return natural language interpretation the number in numberString.
     */
    @Override
    public String getWords() {
        double number = Double.parseDouble(numberString.replaceAll("[ ,]", ""));
        double fraction = number - Math.floor(number);
        if (fraction != 0) {
            return getWords(Math.floor(number)) + " point " + getWordsFraction(fraction);
        } else {
            return getWords(number);
        }
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
