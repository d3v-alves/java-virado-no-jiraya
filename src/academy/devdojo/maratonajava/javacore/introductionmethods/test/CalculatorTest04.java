package academy.devdojo.maratonajava.javacore.introductionmethods.test;

import academy.devdojo.maratonajava.javacore.introductionmethods.domain.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        calculator.changeTwoNumbers(a, b);
        System.out.println("Dentro do CalculatorTest04");
        System.out.println("A " + a);
        System.out.println("B " + b);
    }
}