package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        /* 需求：一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
        请用程序实现获取这三个和尚的最高身高。*/
        int height1=150;
        int height2=210;
        int height3=165;
        int max;
        max=(height1>height2?height1:height2)>height3?(height1>height2?height1:height2):height3;
        System.out.println("三个和尚的最高身高为"+max+"cm");
        //ctrl+alt+L 自动的格式化代码
    }
}
