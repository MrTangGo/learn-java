package com.learnjava.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        arrayList.add("ddd");
        arrayList.add(333);

        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            String next = (String)it.next();
            System.out.println(next.length());
        }
    }
}
