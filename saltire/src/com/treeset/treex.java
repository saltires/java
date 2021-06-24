package com.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class treex {
    public static void main(String[] args) {
        TreeSet<Student1> se = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int comNumber = o1.getSum() - o2.getSum();
                return comNumber == 0 ? o1.getName().compareTo(o2.getName()) : comNumber;
            }
        });

        Student1 s1 = new Student1("a", 21, 20);
        Student1 s2 = new Student1("d", 22, 13);
        Student1 s3 = new Student1("b", 22, 26);
        Student1 s4 = new Student1("c", 24, 21);
        Student1 s5 = new Student1("x", 24, 21);
        Student1 s6 = new Student1("x", 24, 21);

        se.add(s1);
        se.add(s2);
        se.add(s3);
        se.add(s4);
        se.add(s5);
        se.add(s6);

        System.out.println(se);
    }
}
