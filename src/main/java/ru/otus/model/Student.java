package ru.otus.model;

public class Student {

    private Integer age;
    private String name;
    private Integer mark;

    public Student() { }

    public Student(Integer age, String name, Integer mark) {
        this.age = age;
        this.name = name;
        this.mark = mark;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}
