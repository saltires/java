package com.Generic;

public class genericmethoddemo {
    public static void main(String[] args) {
        genericmethod x = new genericmethod("age");

        x.show("123", "1");
        x.show(30, 1);
        x.show(true, false);
    }
}
