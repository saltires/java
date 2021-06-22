package com.StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerClass {
    public static void main(String[] args) {
        initManager();
    }

    public static void initManager() {
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("---------欢迎来到管理系统------------");
            System.out.println("1 创建学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出使用");

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择: ");
            String choose = sc.nextLine().trim();

            switch (choose) {
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("学生已修改");
                    break;
                case "3":
                    System.out.println("学生已修改");
                    break;
                case "4":
                    System.out.println("学生已修改");
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
            }
        }
    }

    /**
     * 添加学生
     * @param array
     */
    public static void addStudent(ArrayList<Student> array) {
        Scanner sct_id = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String id = sct_id.nextLine();

        Scanner sct_name = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sct_id.nextLine();

        Scanner sct_age = new Scanner(System.in);
        System.out.println("请输入学生年龄：");
        String age = sct_id.nextLine();

        Scanner sct_address = new Scanner(System.in);
        System.out.println("请输入学生地址：");
        String address = sct_id.nextLine();

        Student stu = new Student(name, age, id, address);

        array.add(stu);
    }


}
