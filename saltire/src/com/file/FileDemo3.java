package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件操作（一个一个字节复制）
 */
public class FileDemo3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("E:\\knight\\test.txt");
            FileOutputStream fileOutput = new FileOutputStream("E:\\knight\\test1.txt");

            int state = 0;

            while ((state = fileInput.read()) != 0) {
                fileOutput.write(state);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
