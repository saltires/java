package com.saltire;

public class array_init {
    /*
    * 数组的两种初始化方式
    * */
    public static void main(String[] args) {
        // 1 数组的动态初始化
        int[] arr = new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 2 数组的静态初始化
        int[] arr1 = new int[]{1, 2, 3};

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        // 2.1 数组的静态初始化 - 简写
        int[] arr2 = {1, 2, 3};
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
    }
}
