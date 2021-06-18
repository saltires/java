package com.saltire;

public class method {
    public static void main(String[] args) {
        methodOne(1, "1");
        methodTwo();
        methodTho();
    }

    public static void methodOne(int number, String string) {
        System.out.println(number);
        System.out.println(string);
        System.out.println("1");
    }

    public static void methodTwo() {
        System.out.println("2");
        return;
    }

    public static int methodTho() {
        System.out.println("3");
        return 100;
    }
}
