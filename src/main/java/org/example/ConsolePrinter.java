package org.example;

import java.util.List;

public class ConsolePrinter {
    private final Operand operand;
    private final List<CalculusStep> calculusSteps;

    public ConsolePrinter(Operand operand, List<CalculusStep> calculusSteps) {
        this.operand = operand;
        this.calculusSteps = calculusSteps;
    }

    public void print() {
        for (int i = 0; i < calculusSteps.size(); i++) {
            CalculusStep calculusStep = calculusSteps.get(i);

            if(i == 0)
                System.out.println(calculusStep.getStepNumber());
            else
                System.out.println(operand.getSymbol() + calculusStep.getStepNumber() + " (=" + calculusStep.getResult() + ")");
        }

        System.out.println("-------");
        System.out.println("total = " + calculusSteps.getLast().getResult() + " (" + operand.getComputationType().getType() + ")");
    }
}
