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
    @DisplayName("문자열 테스트")
    void strTest() {
        String str = "1:2:3r4y5~6}7?8/9;10";
        int[] intArr = stringCalculator.stringToIntArr(str);
        for (int i : intArr) {
            log.info("args = {}", i);
        }
        assertEquals(55, stringCalculator.sum(intArr));
    }
    @Test
    @DisplayName("문자열에 음수값이 있을경우")
    void exTest() {
        int[] arr = {1, 2, 3, 4, 5, -1};
        Assertions.assertThrows(RuntimeException.class, () -> stringCalculator.sum(arr));
    }

}