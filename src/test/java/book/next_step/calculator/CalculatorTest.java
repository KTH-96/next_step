package book.next_step.calculator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        log.info("@BeforeEach 초기화 실행");
        calculator = new Calculator();
    }

    @AfterEach
    void end() {
        log.info("@AfterEach 후처리 실행");
    }

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