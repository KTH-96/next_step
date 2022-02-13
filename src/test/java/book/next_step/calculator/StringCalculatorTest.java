package book.next_step.calculator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    @DisplayName("sum_문자하나")
    void sumTest1() {
        assertEquals(1, stringCalculator.sum("1"));
    }
    @Test
    @DisplayName("sum_null_또는_반문자")
    void sumTest2() {
        assertEquals(0, stringCalculator.sum(""));
        assertEquals(0, stringCalculator.sum(null));
    }
    @Test
    @DisplayName("sum_쉼표_또는_콜론_구분자")
    void sumTest3() {
        assertEquals(6, stringCalculator.sum("1,2;3"));
    }
    @Test
    @DisplayName("sum_음수")
    void sumTest4() {
        assertThrows(RuntimeException.class, () -> stringCalculator.sum("-1;2"));
    }
}