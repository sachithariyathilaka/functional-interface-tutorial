package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.interfaces.ScenarioOne;
import io.github.sachithariyathilaka.interfaces.ScenarioThree;
import io.github.sachithariyathilaka.interfaces.ScenarioTwo;

/**
 * This is the main class for the functional interface tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/03/09
 */
public class FunctionInterfaceTutorial {

    public static void main( String[] args ) {
        FunctionInterfaceTutorial functionInterfaceTutorial = new FunctionInterfaceTutorial();
        functionInterfaceTutorial.getScenarioOne();
        functionInterfaceTutorial.getScenarioTwo();
        functionInterfaceTutorial.getScenarioThree();;
    }

    /**
     * This method used to execute scenario one functional interface.
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
     * This method used to execute scenario two functional interface.
     */
    public void getScenarioTwo() {
        ScenarioTwo scenarioTwo = (value1, value2) -> System.out.println("Calculated value is: " + (value1 - value2));
        scenarioTwo.add(20, 10);
        scenarioTwo.subtract(20, 10);
    }

    /**
     * This method used to execute scenario three functional interface.
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
