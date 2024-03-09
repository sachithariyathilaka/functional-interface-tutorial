package com.bytegen;

/**
 * @class App
 * @description This is the main class for the functional interface tutorial.
 *
 * @author Sachith Ariyathilaka
 * @version 1.0.0
 * @date 2024/03/09
 */
public class App {

    /**
     * @method main
     * @description Java main method.
     */
    public static void main( String[] args ) {
        App app = new App();
        app.getScenarioOne();
        app.getScenarioTwo();
        app.getScenarioThree();;
    }

    /**
     * @method getScenarioOne
     * @description This method used to execute scenario one functional interface.
     */
    public void getScenarioOne() {
        ScenarioOne scenarioOne = new ScenarioOne() {
            @Override
            public void add(int firstValue, int secondValue) {
                ScenarioOne.super.add(firstValue, firstValue);
            }
        };

        scenarioOne.add(20, 10);
    }

    /**
     * @method getScenarioTwo
     * @description This method used to execute scenario two functional interface.
     */
    public void getScenarioTwo() {
        ScenarioTwo scenarioTwo = (value1, value2) -> System.out.println("Calculated value is: " + (value1 - value2));
        scenarioTwo.add(20, 10);
        scenarioTwo.subtract(20, 10);
    }

    /**
     * @method getScenarioThree
     * @description This method used to execute scenario three functional interface.
     */
    public void getScenarioThree() {
        ScenarioThree scenarioThree = new ScenarioThree() {
            @Override
            public void add(int firstValue, int secondValue) {
                ScenarioThree.super.add(firstValue, secondValue);
            }

            @Override
            public void subtract(int firstValue, int secondValue) {
                System.out.println("Calculated value is: " + (firstValue / secondValue));
            }

            @Override
            public void multiply(int firstValue, int secondValue) {
                System.out.println("Calculated value is: " + (firstValue + secondValue));
            }
        };

        scenarioThree.add(10, 20);
        scenarioThree.subtract(20, 10);
        scenarioThree.multiply(20, 10);
    }
}
