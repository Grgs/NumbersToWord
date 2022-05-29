package com.genspark;

import org.springframework.stereotype.Component;

@Component
public class IndianNumbersToWords extends WesternNumbersToWords implements NumbersToWords {
    IndianNumbersToWords() {
        // FIXME
        super();
        this.modernNumbers = new IndianEnglishNumbersMap();
    }

    @Override
    public String getWords(Double number) {
        // FIXME
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (modernNumbers.numberMap.containsKey(number)) {
            words += modernNumbers.numberMap.get(number);
        } else if (number < 100) {
            words += modernNumbers.numberMap.get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + modernNumbers.numberMap.get(Math.floor(number) % 10);
            }
        } else if (number < 1000) {
            words += modernNumbers.numberMap.get(Math.floor(number / 100)) + " " + modernNumbers.tensMap.get(100D);
            if (number % 100 != 0) {
                words += " and " + getWords(number % 100);
            }
        } else {
            int exponent = (int) Math.floor(Math.log10(number) / 2);
            double divisor = Math.pow(10, exponent * 2);
            words += getWords(Math.floor(number / divisor)) + " " + modernNumbers.tensMap.get(divisor);
            if (number % divisor != 0) {
                words += " " + getWords(number % divisor);
            }
        }
        return words;
    }
}
