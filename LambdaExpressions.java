package com.bridzelab;

@FunctionalInterface
interface MathOperationApp {
    static void printResult(int a, int b, String function, MathOperationApp object) {
        System.out.println("Result of :" + function + " is " + object.calculate(a, b));
    }

    int calculate(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println("Welcome to Lambda Expression program");
        MathOperationApp add = ((a, b) -> a + b);
        MathOperationApp subtract = ((a, b) -> a - b);
        MathOperationApp division = ((a, b) -> a / b);
        MathOperationApp.printResult(10, 20, "Addition", add);
        MathOperationApp.printResult(20, 10, "Subtract", subtract);
        MathOperationApp.printResult(20, 10, "Division", division);
    }
}
