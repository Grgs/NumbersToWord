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
        this.tensMap.replace(Math.pow(10, 27), "quadrilliard");
        this.tensMap.replace(Math.pow(10, 30), "quintillion");
        this.tensMap.replace(Math.pow(10, 33), "quintilliard");
        this.tensMap.replace(Math.pow(10, 36), "sextillion");
        this.tensMap.replace(Math.pow(10, 39), "sextilliard");
        this.tensMap.replace(Math.pow(10, 42), "septillion");
        this.tensMap.replace(Math.pow(10, 45), "septilliard");
        this.tensMap.replace(Math.pow(10, 48), "octillion");
        this.tensMap.replace(Math.pow(10, 51), "octilliard");
        this.tensMap.replace(Math.pow(10, 54), "nonillion");
        this.tensMap.replace(Math.pow(10, 57), "nonilliard");
        this.tensMap.replace(Math.pow(10, 60), "decillion");
        this.tensMap.replace(Math.pow(10, 63), "decilliard");
    }
}
