package com.Generic;

public class GenericImplDemo {
    public static void main(String[] args) {
        GenericImpl<String> x = new GenericImpl<>();

        x.show("123");

        GenericImpl<Integer> x1 = new GenericImpl<>();

        x1.show(100);
    }
}
