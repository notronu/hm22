package calculator.skypro.service;

import calculator.skypro.exception.ZeroDivideException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import static calculator.skypro.CalculatorConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectSum(int num1, int num2) {
        assertEquals(num1 + num2, service.sum(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectSubstract(int num1, int num2) {
        assertEquals(num1 - num2, service.substract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMultiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectDivide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }



    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ONE, ONE),
                Arguments.of(THREE, ONE),
                Arguments.of(TWO, TWO),
                Arguments.of(THREE, THREE),
                Arguments.of(THREE, ONE));
    }



}