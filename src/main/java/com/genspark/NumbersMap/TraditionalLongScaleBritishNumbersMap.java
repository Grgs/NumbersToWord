package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

@Component
public class TraditionalLongScaleBritishNumbersMap extends ModernNumbersMap {
    public TraditionalLongScaleBritishNumbersMap() {
        super();
        this.tensMap.replace(Math.pow(10, 9), "Thousand million");
        this.tensMap.replace(Math.pow(10, 12), "Billion");
        this.tensMap.replace(Math.pow(10, 15), "Thousand billion");
        this.tensMap.replace(Math.pow(10, 18), "Trillion");
        this.tensMap.replace(Math.pow(10, 21), "Thousand trillion");
        this.tensMap.replace(Math.pow(10, 24), "Quadrillion");
        this.tensMap.replace(Math.pow(10, 27), "Thousand quadrillion");
        this.tensMap.replace(Math.pow(10, 30), "Quintillion");
        this.tensMap.replace(Math.pow(10, 33), "Thousand quintillion");
        this.tensMap.replace(Math.pow(10, 36), "Sextillion");
        this.tensMap.replace(Math.pow(10, 39), "Thousand sextillion");
        this.tensMap.replace(Math.pow(10, 42), "Septillion");
        this.tensMap.replace(Math.pow(10, 45), "Thousand septillion");
        this.tensMap.replace(Math.pow(10, 48), "Octillion");
        this.tensMap.replace(Math.pow(10, 51), "Thousand octillion");
        this.tensMap.replace(Math.pow(10, 54), "Nonillion");
        this.tensMap.replace(Math.pow(10, 57), "Thousand nonillion");
        this.tensMap.replace(Math.pow(10, 60), "Decillion");
        this.tensMap.replace(Math.pow(10, 63), "Thousand decillion");
    }
}
