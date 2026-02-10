package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1=10;
        byte b2=20;
        //现在我们要强转的是b1+b2计算之后的结果
        //(byte)b1+b2强转的是b1，不是最终结果
        byte result= (byte) (b1+b2);
        System.out.println(result);
    }
}
