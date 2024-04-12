package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> numbers;
    private final Operand operand;

    public Calculator(List<Integer> numbers, Operand operand) {
        this.numbers = numbers;
        this.operand = operand;
    }

    public  List<CalculusStep> calculate() {
        Integer result = 0;
        List<CalculusStep> calculusSteps = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                result = numbers.get(i);
            } else {
                result = switch (operand) {
                    case ADD -> add(result, numbers.get(i));
                    case MULTIPLY -> multiply(result, numbers.get(i));
                };
            }

            calculusSteps.add(new CalculusStep(numbers.get(i), result));
        }

        return calculusSteps;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
