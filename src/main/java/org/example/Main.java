package org.example;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ParserInterface parser = new CsvParser(args[0]);
        List<Integer> numbers = parser.parse();

        Operand operand = Operand.fromSymbol(args[1]);

        Calculator calculator = new Calculator(numbers, operand);
        List<CalculusStep> calculusSteps = calculator.calculate();

        ExporterInterface exporter = new ConsoleExporter(operand, calculusSteps);
        exporter.export();
    }
}