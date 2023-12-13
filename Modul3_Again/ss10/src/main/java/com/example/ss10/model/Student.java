package com.example.ss10.model;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int point;
    private String classification;

    public String getClassification() {
        return classification;
    }

    public Student(int id, String name, String gender, int point, String classification) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = point;
        this.classification = classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Student(int id, String name, String gender, int point) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.point = point;
    }
}
