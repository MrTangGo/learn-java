package com.mrtanggo.test2;

public class StringHandlerDemo {
    public static void main(String[] args) {
        useStringHandler1(message -> System.out.println(message), "hello world");
        useStringHandler2(new StringHandler() {
            @Override
            public void printMessage(String msg) {
                System.out.println("haha..." + msg);
            }
        });
    }

    public static void useStringHandler1(StringHandler stringHandler,String message) {
        stringHandler.printMessage(message);
    }

    public static void useStringHandler2(StringHandler stringHandler) {
        stringHandler.printMessage("hello world");
    }
}

interface StringHandler{
    void printMessage(String msg);
}
