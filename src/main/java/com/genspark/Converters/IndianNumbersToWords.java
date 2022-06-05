package com.genspark.Converters;

import com.genspark.NumbersMap.IndianNumbersWords;
import org.springframework.stereotype.Component;

/**
 * Converts numbers to words according to the Indian English number system.
 */
@Component
//@Primary
public class IndianNumbersToWords extends WesternNumbersToWords implements NumbersToWords {
    public IndianNumbersToWords() {
        super(new IndianNumbersWords());
    }

    @Override
    public String generateWordsForNumber(Double number) {
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (numbersWords.getNumberMap().containsKey(number)) {
            words += numbersWords.getNumberMap().get(number);
        } else if (number < 100) {
            words += numbersWords.getNumberMap().get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + numbersWords.getNumberMap().get(Math.floor(number) % 10);
            }
        } else if (number < 1000) {
            words += numbersWords.getNumberMap().get(Math.floor(number / 100)) + " " + numbersWords.getMagnitudeWords().get(100D);
            if (number % 100 != 0) {
                words += " and " + generateWordsForNumber(number % 100);
            }
        } else {
            int exponent = (int) Math.floor(Math.log10(number) - 1) / 2;
            double divisor = Math.pow(10, exponent * 2 + 1);
            words += generateWordsForNumber(Math.floor(number / divisor)) + " " + numbersWords.getMagnitudeWords().get(divisor);
            if (number % divisor != 0) {
                words += " " + generateWordsForNumber(number % divisor);
            }
        }
        return words;
    }
}
