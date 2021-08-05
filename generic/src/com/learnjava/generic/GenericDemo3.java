package com.learnjava.generic;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericDemo3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");

        Object[] objects = arrayList.toArray();
        //返回的是object类型的
        System.out.println(Arrays.toString(objects));

        String[] strings = arrayList.toArray(new String[arrayList.size()]);
        System.out.println(Arrays.toString(strings));
    }

}
