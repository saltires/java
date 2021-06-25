package com.file;

import java.io.File;

public class fileDemo {
    public static void main(String[] args) {
        // File file = new File("E:\\qishi\\test.txt");
        // System.out.println(file);

        // File file = new File("E:\\qishi", "test.txt");
        // System.out.println(file);

        File file = new File("E:\\qishi");
        File file1 = new File(file, "text.txt");
        System.out.println(file1);
    }
}
