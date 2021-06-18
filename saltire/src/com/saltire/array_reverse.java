package com.saltire;

public class array_reverse {
    /**
     * 数组反转
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void reverse(int[] array) {
        for (int start = 0, end = array.length - 1; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }
}
