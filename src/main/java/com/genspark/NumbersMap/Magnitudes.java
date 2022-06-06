package com.genspark.NumbersMap;

import java.util.Map;

/**
 * Names of orders of magnitude.
 */
public interface Magnitudes extends Map<Double, String> {
    /**
     * Get the maximum magnitude that has a name.
     *
     * @return Maximum magnitude value.
     */
    default double getMaxMagnitude() {
        return this.keySet().stream().reduce(Double::max).get();
    }
}
