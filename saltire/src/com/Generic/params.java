package com.Generic;

/**
 * 可变参数
 */
public class params {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
    }

    public static int sum(int... arr) {
        int sum = 0;

        for (int i: arr) {
            sum += i;
        }

        return sum;
    }
}
