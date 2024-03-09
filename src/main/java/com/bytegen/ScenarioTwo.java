package com.bytegen;

/**
 * @interface ScenarioTwo
 * @description This is the functional interface of the scenario two in example.
 *
 * @author Sachith Ariyathilaka
 * @version 1.0.0
 * @date 2024/03/09
 */
@java.lang.FunctionalInterface
public interface ScenarioTwo {

    default void add(int firstValue, int secondValue) {
        System.out.println("Calculated value is: " + (firstValue + secondValue));
    }

    void subtract(int firstValue, int secondValue);
}
