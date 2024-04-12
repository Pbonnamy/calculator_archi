package org.example;

public enum ComputationType {
    SUM("addition"),
    PRODUCT("multiplication");

    private final String type;

    ComputationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
