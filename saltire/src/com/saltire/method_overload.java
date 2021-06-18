package com.saltire;

public class method_overload {
    public static void main(String[] args) {
        int a = sum(2,3);
        System.out.println(a);

        int b = sum(1,2,3);
        System.out.println(b);

        double c = sum(1.0, 2.1);
        System.out.println(c);
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static double sum(double number1, double number2) {
        return number1 + number2;
    }
}
