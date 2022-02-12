package book.next_step.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(9, calculator.add(6, 3));
    }

    @Test
    void subtract() {
        assertEquals(3, calculator.subtract(6, 3));
    }

    @Test
    void multiply() {
        assertEquals(18, calculator.multiply(6, 3));
    }

    @Test
    void divide() {
        assertEquals(2, calculator.divide(6, 3));
    }
}