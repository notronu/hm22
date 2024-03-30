package calculator.skypro.controller;

import calculator.skypro.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/sum")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        int result = service.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping(path = "/substract")
    public String substract(@RequestParam int num1, @RequestParam int num2) {
        int result = service.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        int result = service.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {

        float result = service.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }
}
