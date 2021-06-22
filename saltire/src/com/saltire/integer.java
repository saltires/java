package com.saltire;

/**
 * 基本类型包装类 - Integer
 * 1、将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
 * 2、常用的操作之一：用于基本数据与字符串之间的转换
 * 3、基本类型包装类大多数都是其基本类型名字的首字母大写，除了 int 类型对应的 Integer 和 char 类型的 Character
 */
public class integer {
    public static void main(String[] args) {
        // 基本类型包装类生成方法之构造函数（已过时）
        Integer i1 = new Integer(100);
        System.out.println("i1:" + i1);

        // 基本类型包装类生成方法之构造函数（已过时）
        Integer i2 = new Integer("100");
        System.out.println("i2:" + i2);

        // 基本类型包装类生成方法之静态方法 valueOf
        Integer i3 = Integer.valueOf(100);
        System.out.println("i3:" + i3);

        // 基本类型包装类生成方法之静态方法 valueOf
        Integer i4 = Integer.valueOf("200");
        System.out.println("i4:" + i4);
    }
}
