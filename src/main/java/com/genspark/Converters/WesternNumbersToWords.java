package com.genspark.Converters;

import com.genspark.NumbersMap.Magnitudes;
import com.genspark.NumbersMap.SmallNumberWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Converts numbers to words according to western number systems.
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
    SmallNumberWords smallNumberWords = new SmallNumberWords();
    @Autowired
    Magnitudes magnitudes;

    /**
     * Generates the words describing the number.
     * example: 123 will return "one hundred and twenty-three"
     *
     * @param number number to be converted to words.
     * @return natural language interpretation of the number.
     */
    public String generateWordsForNumber(Double number) {
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (smallNumberWords.containsKey(number)) {
            words += smallNumberWords.get(number);
        } else if (number < 100) {
            words += smallNumberWords.get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + smallNumberWords.get(Math.floor(number) % 10);
            }
        } else if (number < 1000) {
            words += smallNumberWords.get(Math.floor(number / 100)) + " " + magnitudes.get(100D);
            if (number % 100 != 0) {
                words += " and " + generateWordsForNumber(number % 100);
            }
        } else if (number < (magnitudes.getMaxMagnitude() * 1000)) {
            int exponent = (int) Math.floor(Math.log10(number) / 3);
            double divisor = Math.pow(10, exponent * 3);
            words += generateWordsForNumber(Math.floor(number / divisor)) + " " + magnitudes.get(divisor);
            if (number % divisor != 0) {
                words += " " + generateWordsForNumber(number % divisor);
            }
        } else {
            double divisor = magnitudes.getMaxMagnitude();
            words += String.format("(%s) %s", generateWordsForNumber(Math.floor(number / divisor)),
                    magnitudes.get(divisor));
            if (number % divisor != 0) {
                words += " " + generateWordsForNumber(number % divisor);
            }
        }
        return words;
    }

    /**
     * Generates the words describing the fraction.
     * example: 12.345 will return "three four five"
     *
     * @param fraction number with a fraction to be converted to words.
     * @return natural language interpretation of the fraction.
     */
    private String generateWordsForFraction(String fraction) {
        String fractionPart = fraction.split("\\.")[1].replaceFirst("0*$", "");
        return " point " + generateWordsOnly(fractionPart);
    }

    private String generateWordsOnly(String numberString) {
        StringBuilder words = new StringBuilder();
        for (String numberChar : numberString.split("")) {
            words.append(" ").append(smallNumberWords.get(Double.parseDouble(numberChar)));
        }
        return words.toString().strip();
    }

    /**
     * Converts the number to words.
     *
     * @return natural language interpretation the number in numberString.
     */
    public String getWords() {
        double number = Double.parseDouble(numberString.replaceAll("[ ,]", ""));
        double fraction = number - Math.floor(number);
        if (fraction != 0) {
            return generateWordsForNumber(Math.floor(number)) + generateWordsForFraction(numberString);
        } else {
            return generateWordsForNumber(number);
        }
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    @Override
    public Magnitudes getMagnitudes() {
        return magnitudes;
    }

    @Override
    public void setMagnitudes(Magnitudes magnitudes) {
        this.magnitudes = magnitudes;
    }

}
