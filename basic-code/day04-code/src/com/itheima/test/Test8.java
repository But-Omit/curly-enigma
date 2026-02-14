package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        boolean isLightGreen=false;
        boolean isLightYellow=false;
        boolean isLightred=true;

        if(isLightGreen){
            System.out.println("go!");
        }else if(isLightYellow){
            System.out.println("slow!");
        }else if(isLightred){
            System.out.println("stop!");
        }
    }
}
