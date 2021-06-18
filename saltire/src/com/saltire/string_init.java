package com.saltire;

public class string_init {
    public static void main(String[] args) {
        // 1 直接赋值的方式创建字符串
        String s1 = "abc";
        System.out.println("1: " + s1);

        // 2 创建一个空白字符串对象，不包含任何内容
        String s2 = new String();
        System.out.println("2: " + s2);

        // 3 根据字符数组的内容来初始化创建字符串
        char[] chArray = {'a', 'b', 'c'};
        String s3 = new String(chArray);
        System.out.println("3: " + s3);

        // 4 根据字节数组的内容俩初始化创建字符串
        byte[] byArray = {97, 98, 99};
        String s4 = new String(byArray);
        System.out.println("4: " + s4);
    }
}
