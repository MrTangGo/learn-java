package com.learnjava.collection.iterator;

import java.util.ArrayList;

// 增强for循环
// 注意：只有实现Iterator接口的类才可以使用迭代器和增强for:比如说数组或者是collection
// 
public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");

        // 1.for中的数据类型一定是要数组或是集合中的数据类型
        // 2.str代表集合或是数组中的每一个元素
        // 3.arrayList就是要遍历的集合或者是数组
        for (String str: arrayList){
            System.out.println(str);
        }
    }
}
