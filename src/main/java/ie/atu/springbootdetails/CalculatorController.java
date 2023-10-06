package ie.atu.springbootdetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    double total;

    Calculation values = new Calculation();
    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable double num1, @PathVariable double num2, @PathVariable String operation){
        return "operation: " + operation + " total: " + total + values.getSub();
    }
}
/*
    double result;
        switch (operation.toLowerCase()){
                case "add":
                result = num1 + num2;
                break;
                case "subtract":
                result = num1 - num2;
                break;
                case "multiply":
                result = num1 * num2;
                break;
                case "divide":
                result = num1 / num2;

default:
        throw new IllegalArgumentException("Invalid Operation: " + operation);
        }*/
