package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet 存储自定义 Student 对象，并实现排序
 * 这里初始化 TreeSet 时采用的是传入 Comparator 对象的方式
 */
public class trees {
    public static void main(String[] args) {
        TreeSet<Student> se = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compareNumber = o1.getAge() - o2.getAge();
                return compareNumber == 0 ? o1.getName().compareTo(o2.getName()) : compareNumber;
            }
        });

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
