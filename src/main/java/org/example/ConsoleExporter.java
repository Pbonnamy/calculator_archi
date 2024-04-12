package org.example;

import java.util.List;

public class ConsoleExporter implements ExporterInterface {
    private final Operand operand;
    private final List<CalculusStep> calculusSteps;

    public ConsoleExporter(Operand operand, List<CalculusStep> calculusSteps) {
        this.operand = operand;
        this.calculusSteps = calculusSteps;
    }

    public void export() {
        for (int i = 0; i < calculusSteps.size(); i++) {
            CalculusStep calculusStep = calculusSteps.get(i);

            if(i == 0)
                System.out.println("\t\t" + calculusStep.getStepNumber());
            else
                System.out.println("\t\t" + operand.getSymbol() + calculusStep.getStepNumber() + " (=" + calculusStep.getResult() + ")");
        }

        System.out.println("\t\t-------");
        System.out.println("total = " + calculusSteps.getLast().getResult() + " (" + operand.getComputationType().getType() + ")");
    }
}
