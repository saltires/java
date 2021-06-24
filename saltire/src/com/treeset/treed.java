package com.treeset;

import java.util.TreeSet;

/**
 * TreeSet 要想存储自定义对象，该对象的类必须实现 Comparable 接口，并重写 compareTo 方法
 * 使用 TreeSet 存储字符串时，原生支持自然排序，因为 String 类实现了 Comparable 接口，并重写了 compareTo 方法
 */
public class treed{
    public static void main(String[] args) {
        TreeSet<Student> se = new TreeSet<>();

        Student s1 = new Student("a", 11);
        Student s2 = new Student("d", 31);
        Student s3 = new Student("b", 41);
        Student s4 = new Student("c", 21);
        Student s5 = new Student("a", 21);

        se.add(s1);
        se.add(s2);
        se.add(s3);
        se.add(s4);
        se.add(s5);

        System.out.println(se);
    }
}
