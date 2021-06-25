package com.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向 E:\knight\test.txt 文件写入 aaa
 */
public class FileDemo1 {
    public static void main(String[] args) {
        FileOutputStream file = null;
        try {
            file = new FileOutputStream("E:\\knight\\test.txt");
            try {
                // 1、单个写入字节
                // file.write(97);
                // file.write(97);
                // file.write(97);

                // 2、写入字节数组
                // byte[] bytes = {97,97,98};
                // file.write(bytes);

                // 3、写入字节数组，但是指定起始索引及长度
                byte[] bytes = {97,98,99,100,101};
                file.write(bytes, 1, 2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
