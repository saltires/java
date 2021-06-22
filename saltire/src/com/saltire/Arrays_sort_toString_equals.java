package com.saltire;

import java.util.Arrays;

/**
 * 工具类 - Arrays
 */
public class Arrays_sort_toString_equals {
    public static void main(String[] args) {
        /**
         * 调用 Arrays 的 toString方法展示数组内容
         */
        int[] arr = {1,23,4,56,7};
        int[] arr1 = {1,23,4,56,7};
        System.out.println("排序前：" + Arrays.toString(arr));

        /**
         * Arrays 的 sort方法进行排序
         */
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));

        /**
         * Arrays 是一个工具类，工具类的设计思想有两个：
         * 1、构造函数使用 private 修饰，防止外部创建工具类的实例
         * 2、成员方法使用 public static 修饰，使得开发者直接从类处调用工具方法
         */
        System.out.println(Arrays.equals(arr, arr1));
    }
}
