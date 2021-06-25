package com.file;

import java.io.File;
import java.io.IOException;

public class fileDemo {
    public static void main(String[] args) {
        // 1、创建文件对象
        // File file = new File("E:\\qishi\\test.txt");
        // System.out.println(file);
        //
        // File file = new File("E:\\qishi", "test.txt");
        // System.out.println(file);

        // File file = new File("E:\\qishi");
        // File file1 = new File(file, "text.txt");
        // System.out.println(file1);

        // 2、使用文件对象的方法(createNewFile、mkdir、mkdirs)

        // 2.1 createNewFile，当具有该名称的文件不存在时，创建一个由该抽象路径命名的新文件
        // File file = new File("E:\\test.txt");
        // try {
        //     System.out.println(file.createNewFile());
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // 2.2 mkdir 创建此抽象路径命名的目录
        // File file = new File("E:\\knight");
        //
        // System.out.println(file.mkdir());

        // 2.3 mkdirs 创建此抽象路径命名的目录，当父路径不存在时，递归创建
        // File file = new File("E:\\knight1\\test1");
        //
        // System.out.println(file.mkdirs());

        // 3、使用文件对象的方法（isDirectory、isFile、exists、getAbsoluteFile、getPath）

        // 3.1 isDirectory
        // File file = new File("E:\\knight");

        // System.out.println(file.isDirectory());

        // 3.2 isFile
        // File file = new File("E:\\knight\\test.txt");
        //
        // try {
        //     file.createNewFile();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        //
        // System.out.println(file.isFile());

        // 3.3 exists 测试此抽象路径表示的 File 是否存在
        // File file = new File("E:\\knight");
        //
        // System.out.println("目录：E:\\knight 存在性： " + file.exists());

        // 3.4 getAbsoluteFile 返回此抽象路径名的绝对路径名字符串
        // File file = new File("E:\\knight\\saltire.txt");
        //
        // System.out.println("文件：E:\\knight\\saltire.txt 的绝对路径是： " + file.getAbsoluteFile());

        // 3.5 getPath 将此抽象路径名转为路径字符串
        // File file = new File("E:\\knight\\saltire.txt");
        //
        // System.out.println("文件：E:\\knight\\saltire.txt 的路径字符串是： " + file.getPath());

        // 3.6 getName 返回由此抽象路径表示的文件或目录的名称
        // File file = new File("E:\\knight\\saltire.txt");
        // File file1 = new File("E:\\knight");
        //
        // System.out.println("此文件对象的文件名是：" + file.getName());
        // System.out.println("此文件对象的文件名是：" + file1.getName());

        // 3.7 String[] list() 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        // File file = new File("E:\\knight");
        //
        // String[] list = file.list();
        //
        // for (String s : list) {
        //     System.out.println(s);
        // }

        // 3.8 File[] listFiles() 返回此抽象路径名表示的目录中的文件和目录的 File 对象数组
        // File file = new File("E:\\knight");
        //
        // File[] files = file.listFiles();
        //
        // for (File x : files) {
        //     System.out.println(x);
        // }

        // 4 删除文件或者目录的方法：delete

        // 4.1 delete 操作
        // File file = new File("E:\\knight\\test.txt");
        // System.out.println(file.delete());

        // Note: 当删除一个文件夹时，如果该文件夹不为空，是无法直接删除的，需要先删除其内部的所有子文件及子文件夹后才能进行删除操作
    }
}
