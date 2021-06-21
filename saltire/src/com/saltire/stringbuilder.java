package com.saltire;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println("初始值： " + sb);

        sb.append("hh").append("qishi").append("000");

        System.out.println("第一次修改后值： " + sb);

        sb.reverse();

        System.out.println("反转后值： " + sb);
    }
}
