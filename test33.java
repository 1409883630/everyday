package com.company;
//写一个递归方法，输入一个非负整数，返回组成它的数字之和。

import java.util.Scanner;

public class Main {

    public static int fan(int n){
        int sum=0;
        if(n<10)
        {
            return n;
        }
        else
        {
            return sum=n%10+fan(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sca =new Scanner(System.in);
        int a = sca.nextInt();
        System.out.println(fan(a));



    }
}
