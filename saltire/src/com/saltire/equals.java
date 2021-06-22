package com.saltire;

import com.StudentManager.Student;

public class equals {
    public static void main(String[] args) {
        Student se = new Student("hh", "20", "001", "da");
        Student se1 = new Student("hh", "20", "001", "da");

        System.out.println(se.equals(se1));
        System.out.println(se.toString());
    }
}
