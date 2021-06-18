package com.saltire;

public class array_cross_line {
    public static void main(String[] args) {
        /**
         * 索引越界：访问了数组中不存在索引对应的元素，造成索引越界问题
         */
        int[] arr = new int[3];

        try {
            System.out.println(arr[3]);
        } catch (Throwable error) {
            System.out.println("System.out.println(arr[3]) 执行出错了");
        }

        // 备注： 上面代码访问了索引为 3 的数组元素，导致索引越界，这和 JavaScript 有很大的区别

        /**
         * 空指针异常：访问了一个不指向任何堆内存的变量，也就是访问了一个空指针
         * null：空值，引用数据类型的默认值，表示不指向任何有效的堆中的对象
         */
        arr = null;

        try {
            System.out.println(arr[1]);
        } catch (Throwable error) {
            System.out.println("System.out.println(arr[1]) 执行出错了");
        }
    }
}
