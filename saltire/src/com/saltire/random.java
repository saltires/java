package com.saltire;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class random {
    public static void main(String[] args) {
        // 无序
        // HashSet<Integer> se = new HashSet<>();

        // 有序
        TreeSet<Integer> se = new TreeSet<>();

        Random random = new Random();

        while (se.size() < 10) {
            int i = random.nextInt(20) + 1;

            se.add(i);
        }

        System.out.println(se);
    }
}
