package com.nest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NestDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Student>> arrlist = new ArrayList<>();

        HashMap<String, Student> hashMap1 = new HashMap<>();
        Student s1 = new Student("a", 21);
        Student s2 = new Student("b", 25);
        Student s3 = new Student("c", 22);
        hashMap1.put("s1", s1);
        hashMap1.put("s2", s2);
        hashMap1.put("s3", s3);

        HashMap<String, Student> hashMap2 = new HashMap<>();
        Student s4 = new Student("a1", 31);
        Student s5 = new Student("b1", 35);
        Student s6 = new Student("c1", 32);
        hashMap1.put("s4", s4);
        hashMap1.put("s5", s5);
        hashMap1.put("s6", s6);

        HashMap<String, Student> hashMap3 = new HashMap<>();
        Student s7 = new Student("a2", 41);
        Student s8 = new Student("b2", 45);
        Student s9 = new Student("c2", 42);
        hashMap1.put("s7", s7);
        hashMap1.put("s8", s8);
        hashMap1.put("s9", s9);

        arrlist.add(hashMap1);
        arrlist.add(hashMap2);
        arrlist.add(hashMap3);

        for (HashMap<String, Student> map : arrlist) {
            // Set<Map.Entry<String, Student>> entries = map.entrySet();
            // for (Map.Entry<String, Student> en : entries) {
            //     String key = en.getKey();
            //     Student value = en.getValue();
            //     System.out.println("key: " + key + "value: " + value);
            // }
            Set<String> strings = map.keySet();

            for (String s : strings) {
                Student value = map.get(s);
                System.out.println("key: " + s + "value: " + value);
            }
        }
    }
}
