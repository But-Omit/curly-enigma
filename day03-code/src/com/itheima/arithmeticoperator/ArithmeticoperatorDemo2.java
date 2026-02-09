package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    //结论：
    //整数参与计算，结果只能得到整数
    //小数参与计算，结果有可能是不精确的，如需精确计算，需用到后续知识点
    public static void main(String[] args) {
        //除法
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10.0/3);

        //取模，取余，实际也是做除法运算，只不过得到的是余数而已。
        System.out.println(10%2);
        System.out.println(10%3);

        //应用场景：
        //1.可以用取模来判断，A是否可以被B整除
        //A % B
        //2.可以判断A是否为偶数
        //A%2如果为0，那么A为偶数，如果为1，那么A为奇数
        //3.斗地主发牌
        //把每张牌定义一个序号
        //用序号%3如果结果为1，发给第一个玩家
        //用序号%3如果结果为2，发给第二个玩家
        //用序号%3如果结果为0，发给第三个玩家
    }
}
