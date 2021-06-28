package com.file;

import java.io.*;

public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        // 1、以字节缓冲流的方式创建文件输出流，并写入数据
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\knight\\test3.txt"));

        // bos.write("Hello world ! \r\n knight".getBytes());

        // 2、以字节缓冲流的方式创建文件写入流，并读取数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\knight\\test.txt"));

        // System.out.println((char)bis.read());

        // 3、以字节缓冲流的方式复制文件
        int state = 0;
        byte[] chars = new byte[1024];

        while ((state = bis.read(chars)) != -1) {
            bos.write(chars);
        }

        bos.close();
        bis.close();
    }
}
