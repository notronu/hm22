package calculator.skypro.service;

import calculator.skypro.exception.ZeroDivideException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static calculator.skypro.CalculatorConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Test
    void shouldReturnCorrectSum() {
        assertEquals(ONE + TWO, service.sum(ONE, TWO));
    }

    @Test
    void shouldReturnCorrectSum1() {
        assertEquals(TWO + TWO, service.sum(TWO, TWO));
    }

    @Test
    void shouldReturnCorrectSubstract() {
        assertEquals(TWO - ONE, service.substract(TWO, ONE));
    }

    @Test
    void shouldReturnCorrectMultiply() {
        assertEquals(ONE * THREE, service.multiply(ONE, THREE));
    }

    @Test
    void shouldReturnCorrectDivide() {
        assertEquals(TWO / ONE, service.divide(TWO, ONE));
    }

    @Test
    void shouldThrowZeroDivideException() {
        assertThrows(ZeroDivideException.class, () -> service.divide(THREE, ZERO));
    }



}