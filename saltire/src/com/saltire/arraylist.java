package com.saltire;

import java.util.ArrayList;

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
}
