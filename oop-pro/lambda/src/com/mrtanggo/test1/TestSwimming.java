package com.mrtanggo.test1;

public class TestSwimming {
    public static void main(String[] args) {
        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });
        /*
        Lambda 表达式就是对匿名内部类进行了优化
         */
        goSwimming(() -> {System.out.println("游泳");});
    }
    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

/*
游泳接口
 */
interface Swimming{
    public abstract void swim();
}