package com.smap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMap {
    public static void main(String[] args) {
        // HashMap<String, Student> hashMap = new HashMap<>();
        //
        // Student s1 = new Student("saltire1", 10);
        // Student s2 = new Student("saltire2", 40);
        // Student s3 = new Student("saltire3", 30);
        //
        // hashMap.put("s1", s1);
        // hashMap.put("s2", s2);
        // hashMap.put("s3", s3);
        //
        // Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        //
        // for (Map.Entry<String, Student> entry : entries) {
        //     String key = entry.getKey();
        //     Student value = entry.getValue();
        //     System.out.println("key: " + key + ",value: " + value);
        // }

        HashMap<Student, String> hashMap = new HashMap<>();

        Student s1 = new Student("saltire1", 10);
        Student s2 = new Student("saltire2", 40);
        Student s3 = new Student("saltire3", 30);
        Student s4 = new Student("saltire3", 30);

        hashMap.put(s1, "北京");
        hashMap.put(s2, "南京");
        hashMap.put(s3, "武汉");
        hashMap.put(s4, "东京");

        Set<Student> students = hashMap.keySet();

        for (Student student : students) {
            String address = hashMap.get(student);
            System.out.println("key: " + student + ", address: " + address);
        }
    }
}
