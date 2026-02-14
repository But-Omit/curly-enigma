package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        String noodles="拉面";
        switch(noodles){
            case "拉面":
                System.out.println("吃拉面");
                break;
            case "拌面":
                System.out.println("吃拌面");
                break;
            case "酸辣粉":
                System.out.println("吃酸辣粉");
                break;
            case "板面":
                System.out.println("吃板面");
                break;
            default:
                System.out.println("吃泡面");
                break;
        }
    }
}
