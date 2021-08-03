package com.learnjava.collection;
import java.util.ArrayList;

// 集合的特点
public class CollectionDemo1 {
    public static void main(String[] args) {
        //集合只能存储引用数据类型
        //报错
        // ArrayList<int> list1 = new ArrayList<int>();
        //正常
        ArrayList<String> list2 = new ArrayList<>();
        //可以用基本类型的包装类来代替
        ArrayList<Integer> list3 = new ArrayList<>();

        //集合的长度是可以变的
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        System.out.println(list2);
    }
}
