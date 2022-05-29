package com.genspark.NumbersMap;

import org.springframework.stereotype.Component;

@Component
public class TraditionalLongScaleEuropeanNumbersMap extends ModernNumbersMap {
    public TraditionalLongScaleEuropeanNumbersMap() {
        super();
        this.tensMap.replace(Math.pow(10, 9), "millard");
        this.tensMap.replace(Math.pow(10, 12), "billion");
        this.tensMap.replace(Math.pow(10, 15), "billiard");
        this.tensMap.replace(Math.pow(10, 18), "trillion");
        this.tensMap.replace(Math.pow(10, 21), "trilliard");
        this.tensMap.replace(Math.pow(10, 24), "quadrillion");
        this.tensMap.replace(Math.pow(10, 27), "Quadrilliard");
        this.tensMap.replace(Math.pow(10, 30), "Quintillion");
        this.tensMap.replace(Math.pow(10, 33), "Quintilliard");
        this.tensMap.replace(Math.pow(10, 36), "Sextillion");
        this.tensMap.replace(Math.pow(10, 39), "Sextilliard");
        this.tensMap.replace(Math.pow(10, 42), "Septillion");
        this.tensMap.replace(Math.pow(10, 45), "Septilliard");
        this.tensMap.replace(Math.pow(10, 48), "Octillion");
        this.tensMap.replace(Math.pow(10, 51), "Octilliard");
        this.tensMap.replace(Math.pow(10, 54), "Nonillion");
        this.tensMap.replace(Math.pow(10, 57), "Nonilliard");
        this.tensMap.replace(Math.pow(10, 60), "Decillion");
        this.tensMap.replace(Math.pow(10, 63), "Decilliard");
    }
}
