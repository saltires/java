package com.Generic;

/**
 * 泛型方法
 */
public class genericmethod {
    private String name;

    public genericmethod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <T, Y> void show(T t, Y e) {
        System.out.println(t);
    }
}
