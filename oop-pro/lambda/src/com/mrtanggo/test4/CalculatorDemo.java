package com.mrtanggo.test4;

public class CalculatorDemo {

    public static void main(String[] args) {
        useCalculator((int a, int b) -> {
            return a + b;
        });
    }

    public static void useCalculator(Calculator calculator){
        System.out.println(calculator.calc(1, 4));
    }
}

interface Calculator{
    int calc(int numberA, int numberB);
}