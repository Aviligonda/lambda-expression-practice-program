package com.bridzelab;

@FunctionalInterface
interface MathOperationApp {
    int calculate(int a, int b);
}

public class LambdaExpressions {
    public static void main(String[] args) {
        System.out.println("Welcome to Lambda Expression program");
        MathOperationApp add = ((a, b) -> a + b);
        System.out.println("Addition of two numbers is :" + add.calculate(10, 20));
        MathOperationApp subtract = ((a, b) -> a - b);
        System.out.println("Subtract of two numbers is :" + subtract.calculate(20, 10));
        MathOperationApp division = ((a, b) -> a / b);
        System.out.println("Division of two numbers is :" + division.calculate(20, 10));
    }
}
