package com.genspark.NumbersToWords;

import com.genspark.NumbersMap.IndianNumbersMap;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class IndianNumbersToWords extends WesternNumbersToWords implements NumbersToWords {
    IndianNumbersToWords() {
        super();
        this.numbersMap = new IndianNumbersMap();
    }

    @Override
    public String getWords(Double number) {
        String words = "";
        if (numberString.length() == 0) {
            return words;
        }
        if (number < 0) {
            words += "negative ";
            number *= -1;
        }
        if (numbersMap.numberMap.containsKey(number)) {
            words += numbersMap.numberMap.get(number);
        } else if (number < 100) {
            words += numbersMap.numberMap.get(Math.floor(number / 10) * 10);
            if (number % 10 != 0) {
                words += "-" + numbersMap.numberMap.get(Math.floor(number) % 10);
            }
        } else if (number < 1000) {
            words += numbersMap.numberMap.get(Math.floor(number / 100)) + " " + numbersMap.tensMap.get(100D);
            if (number % 100 != 0) {
                words += " and " + getWords(number % 100);
            }
        } else {
            int exponent = (int) Math.floor(Math.log10(number) - 1) / 2;
            double divisor = Math.pow(10, exponent * 2 + 1);
            words += getWords(Math.floor(number / divisor)) + " " + numbersMap.tensMap.get(divisor);
            if (number % divisor != 0) {
                words += " " + getWords(number % divisor);
            }
        }
        return words;
    }
}
