package com.mrtanggo.test3;

public class RandomNumHandlerDemo {

    public static void main(String[] args) {
        useRandomNumHandler(() -> {
            return Math.random();
        });
    }


    public static void useRandomNumHandler(RandomNumHandler randomNumHandler) {
        System.out.println(randomNumHandler.getNumber());
    }
}

interface RandomNumHandler{
    double getNumber();
}
