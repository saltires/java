package com.saltire;

public class parseint {
    public static void main(String[] args) {
        int a = 100;
        String b = "200";
        String b1 = "200";

        System.out.println(b == b1);

        // 1、数字转字符串
        System.out.println(a + "");

        // 2、数字转字符串
        System.out.println(String.valueOf(a) == "100");
        System.out.println(String.valueOf(a).equals("100"));

        // 3、字符串转数字
        System.out.println(Integer.parseInt(b) == 200);


    }
}
