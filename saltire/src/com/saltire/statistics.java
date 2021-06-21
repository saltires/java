package com.saltire;

import java.util.Scanner;

public class statistics {
    public static void main(String[] args) {
        /**
         * 统计字符串中数字、大写字母、小写字母的个数
         */
        Scanner sc = new Scanner(System.in);
        int BigNumberCount = 0;
        int SmallNumberCount = 0;
        int NumberCount = 0;

        System.out.println("请输入： ");

        String line = sc.nextLine();

        for (int i = 0; i < line.length(); i++) {
            char item = line.charAt(i);

            if (item > 'A' && item < 'Z') {
                BigNumberCount++;
            } else if (item > 'a' && item < 'z') {
                SmallNumberCount++;
            } else if (item > '0' && item < '9') {
                NumberCount++;
            }
        }

        System.out.println("大写字母数量是： " + BigNumberCount + "个;" + "小写字母数量是： " + SmallNumberCount + "个;" + "数字数量是： " + NumberCount + "个;");
    }
}
