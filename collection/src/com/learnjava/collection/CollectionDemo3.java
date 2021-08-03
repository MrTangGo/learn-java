package com.learnjava.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //collection是一个接口，new的时候要new实现对象
        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("bb");
        collection.add("ccc");
        System.out.println(collection);

        //传入的lambda表达式的意思为，过滤掉长度为3的字符串。
        collection.removeIf(
                (String s) -> s.length() == 3
        );

        System.out.println(collection);
    }
}
