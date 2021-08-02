package com.mrtanggo.test5;
/*
代码优化
 */
public class Test5 {

    public static void main(String[] args) {
        useCalculator((a, b) -> a + b);
    }

    public static void useCalculator(Calculator calculator){
        System.out.println(calculator.calc(1, 4));
    }
}

interface Calculator{
    int calc(int numberA, int numberB);
}