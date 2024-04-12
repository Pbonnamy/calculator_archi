package org.example;

public class CalculusStep {
    private final int stepNumber;
    private final int result;

    public CalculusStep(int stepNumber, int result) {
        this.stepNumber = stepNumber;
        this.result = result;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public int getResult() {
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculusStep that = (CalculusStep) o;
        return stepNumber == that.stepNumber && result == that.result;
    }
}
