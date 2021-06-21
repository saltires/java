package com.saltire;

import java.util.Scanner;

public class reverse {
    /**
     * 实现字符串的反转
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入： ");
        String line = sc.nextLine();

        String result = reverse(line);
        System.out.println("结果是： " + result);
    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}
