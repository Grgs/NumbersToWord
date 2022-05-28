package com.genspark;

/**
 * Converts numbers to words.
 */
public class NumbersToWords implements INumbersToWords {
    /**
     * numberString is the number to be converted to words.
     */
    String numberString;
    ModernNumbers modernNumbers;

    NumbersToWords() {
        numberString = "";
        modernNumbers = new ModernNumbers();
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
            int exponent = (int) Math.floor(Math.log10(number) / 3);
            double divisor = Math.pow(10, exponent * 3);
            words += getWords(Math.floor(number / divisor)) + " " + modernNumbers.tensMap.get(divisor);
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
            words.append(" ").append(modernNumbers.numberMap.get(Double.parseDouble(fractionChar)));
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
