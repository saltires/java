package com.saltire;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("he");
        arr.add("knight");
        arr.add("lang");
        arr.add("he");

        arr.remove(3);

        System.out.println("arrlist： " + arr);

        createArray();
        createArray2();
        each();
        listStudent();
    }

    public static void createArray() {
        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("骑兵", "20"));
        arr.add(new Student("步兵", "21"));
        arr.add(new Student("射手", "22"));

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getAge() + arr.get(i).getName());
        }
    }

    public static void createArray2() {
        Collection<String> arr1 = new ArrayList<String>();

        arr1.add("hello");
        arr1.add("hello");
        arr1.add("world");
        arr1.add("java");

        // arr1.clear();

        System.out.println(arr1.contains("hello1"));

        arr1.remove("hello");

        System.out.println(arr1.size());

        System.out.println(arr1);
    }

    public static void each() {
        Collection<String> se = new ArrayList<>();

        se.add("java");
        se.add("hello");
        se.add("world");

        Iterator<String> it = se.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void listStudent() {
        Collection<Student> st = new ArrayList<Student>();

        Student s1 = new Student("张月", "25");
        Student s2 = new Student("张恒", "35");
        Student s3 = new Student("桑木", "38");

        st.add(s1);
        st.add(s2);
        st.add(s3);

        Iterator<Student> it = st.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<Student> lt = new ArrayList<Student>();

        Student l1 = new Student("张月", "25");
        Student l2 = new Student("张月2", "35");
        Student l3 = new Student("张月3", "55");

        lt.add(l1);
        lt.add(l2);
        lt.add(l3);
        // lt.add(1, new Student("溜哼", "34"));
        // lt.set(1, new Student("溜哼", "34"));
        lt.remove(1);
        System.out.println(lt.size());


        Iterator<Student> it1 = lt.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
