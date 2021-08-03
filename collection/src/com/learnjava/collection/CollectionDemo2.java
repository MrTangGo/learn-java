package com.learnjava.collection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //collection是一个接口，new的时候要new实现对象
        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);

        boolean result1 = collection.remove("a");//remove集合中存在的元素，返回true
        boolean result2 = collection.remove("d");//remove集合中不存在的元素，返回false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(collection);
    }
}
