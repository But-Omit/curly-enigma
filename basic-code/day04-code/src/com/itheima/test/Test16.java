package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int number=0;
        if(n<m){
            int t=m;
            m=n;
            n=t;
        }
        for(int i=m;i<=n;i++){
            if(i%3==0&&i%5==0){
                number++;
            }
        }
        System.out.println(number);
    }
}
