package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入一个票号：");
        int ticket=sc.nextInt();
        if(ticket>=1&&ticket<=100){
        if(ticket%2==1){
            System.out.println("坐左边");
        }else{
            System.out.println("坐右边");
        }
        }
        else{
            System.out.println("请输入正确的票号！");
        }
    }
}
