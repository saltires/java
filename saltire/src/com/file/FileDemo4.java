package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文件（循环读取字节数组并写入字节数组的方式）
 */
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("E:\\knight\\xx.mp4");
        FileOutputStream outputStream = new FileOutputStream("E:\\knight\\yy.mp4");

        int state = 0;
        byte[] cache = new byte[1024];

        while ((state = inputStream.read(cache)) != -1) {
            outputStream.write(cache, 0, state);
        }

        inputStream.close();
        outputStream.close();
    }
}
