package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        FileOutputStream stream = null;
        FileInputStream inputStream = null;
        try {
            // 1、以追加的方式写入数据
            stream = new FileOutputStream("E:\\knight\\test.txt", true);

            // stream.write(97);
            // stream.write(97);
            // stream.write(97);

            // 2、逐一读取文件中数据（一次读一个字节）
            // inputStream = new FileInputStream("E:\\knight\\test.txt");

            // System.out.println((char)inputStream.read());
            // System.out.println((char)inputStream.read());

            // 3、循环读取文件中数据（还是一次读一个字节，但是以循环完成所有字节的读取）
            inputStream = new FileInputStream("E:\\knight\\test.txt");

            int result = 0;

            while ((result = inputStream.read()) != -1) {
                System.out.println((char)result);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
