package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class CalculatorTest extends TestCase {

    public void testCalculateShouldSumNumbers() {
        // given
        Calculator calculator = new Calculator(
            List.of(1, 2, 3),
            Operand.ADD
        );

        // expected
        List<CalculusStep> expected = List.of(
            new CalculusStep(1, 1),
            new CalculusStep(2, 3),
            new CalculusStep(3, 6)
        );

        // when
        List<CalculusStep> actual = calculator.calculate();

        // then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    public void testCalculateShouldMultiplyNumbers() {
        // given
        Calculator calculator = new Calculator(
            List.of(1, 2, 3),
            Operand.MULTIPLY
        );

        // expected
        List<CalculusStep> expected = List.of(
            new CalculusStep(1, 1),
            new CalculusStep(2, 2),
            new CalculusStep(3, 6)
        );

        // when
        List<CalculusStep> actual = calculator.calculate();

        // then
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}