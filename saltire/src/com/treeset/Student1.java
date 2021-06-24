package com.treeset;

public class Student1 {
    private String name;
    private Integer chinese;
    private Integer math;

    public Student1(String name, Integer chinese, Integer math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return chinese;
    }

    public void setChinese(Integer chinese) {
        this.chinese = chinese;
    }

    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    public Integer getSum() {
        return this.chinese + this.math;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                '}';
    }
}
