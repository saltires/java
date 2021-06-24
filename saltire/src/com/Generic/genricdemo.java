package com.Generic;

public class genricdemo {
    public static void main(String[] args) {
        generic<String> ge = new generic<String>("saltires");
        generic<Integer> ge1 = new generic<Integer>(3);

        System.out.println(ge);
        System.out.println(ge1);
    }
}
