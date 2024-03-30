package calculator.skypro.service;

import calculator.skypro.exception.ZeroDivideException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String hello() {
        return null;
    }

    @Override
    public int plus(int num1, int num2) {
        return 0;
    }

    @Override
    public int minus(int num1, int num2) {
        return 0;
    }
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 ==0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }



}
