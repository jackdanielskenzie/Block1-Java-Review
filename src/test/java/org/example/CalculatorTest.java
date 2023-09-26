package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // Arrange
        Calculator calculator = new Calculator();
        int input1 = 1;
        int input2 = 2;
        int expectOutput = 3;
        // Act
        int actualOutput = calculator.add(input1,input2);
        // Assert
        assertEquals(expectOutput,actualOutput);
    }
}