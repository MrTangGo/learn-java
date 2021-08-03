package com.learnjava.exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsDemo1 {
    public static void main(String[] args) throws ParseException {
        System.out.println("开始");
        method();
    }
    private static void method() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s = "2048-08-09";
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
