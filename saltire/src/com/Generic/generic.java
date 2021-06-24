package com.Generic;

public class generic<T> {
    private T name;

    public generic(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "generic{" +
                "name=" + name +
                '}';
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
