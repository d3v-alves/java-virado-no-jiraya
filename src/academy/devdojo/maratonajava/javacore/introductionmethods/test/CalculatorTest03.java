package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.divideTwoNumbers(10, 20);
        System.out.println(result);
    }
}
