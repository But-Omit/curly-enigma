package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请录入星期");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("骑车");
                break;
            case 2:
                System.out.println("打球");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("散步");
                break;
            case 5:
                System.out.println("爬山");
                break;
            case 6:
                System.out.println("跑步");
                break;
            case 7:
                System.out.println("休息");
                break;
            default:
                System.out.println("请输入正确的星期！");
                break;
        }
    }
}
