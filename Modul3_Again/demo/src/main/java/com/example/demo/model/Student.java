package com.example.demo.model;

public class Student {
    private int id;
    private String name;
    private String teacher;
    private StudentClass nameClass;

    public Student(int id, String name, String teacher, StudentClass nameClass) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.nameClass = nameClass;
    }
    public Student(String name, String teacher, StudentClass nameClass) {
        this.name = name;
        this.teacher = teacher;
        this.nameClass = nameClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public StudentClass getNameClass() {
        return nameClass;
    }

    public void setNameClass(StudentClass nameClass) {
        this.nameClass = nameClass;
    }
}
