package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入成绩：");
        int grade=sc.nextInt();
        if(grade>=0&&grade<=100) {
            if (grade >= 95 && grade <= 100) {
                System.out.println("车");
            } else if (grade >= 90 && grade <= 94) {
                System.out.println("游乐场");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("娃娃");
            } else if (grade < 80) {
                System.out.println("没有奖励");
            }
        }else{
            System.out.println("当前录入成绩不合法！");
        }
    }
}
