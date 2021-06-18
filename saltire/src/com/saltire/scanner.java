package com.saltire;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        String string = sc.nextLine();

        System.out.println("你输入的是： " + string);
    }
}
