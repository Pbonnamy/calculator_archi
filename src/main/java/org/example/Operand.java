package org.example;

public enum Operand {
    ADD("+"),
    MULTIPLY("*");

    private final String symbol;

    Operand(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public ComputationType getComputationType() {
        return switch (this) {
            case ADD -> ComputationType.SUM;
            case MULTIPLY -> ComputationType.PRODUCT;
            default -> throw new IllegalArgumentException("Unknown operand: " + this);
        };
    }

    public static Operand fromSymbol(String symbol) {
        return switch (symbol) {
            case "+" -> ADD;
            case "*" -> MULTIPLY;
            default -> throw new IllegalArgumentException("Unknown symbol: " + symbol);
        };
    }
}
