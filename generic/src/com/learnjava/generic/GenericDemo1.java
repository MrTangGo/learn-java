package com.learnjava.generic;

public class GenericDemo1 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setElement("aaa");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(123);
        System.out.println(integerBox.getElement());
    }
}
