package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
public class Student {
@Id
    private int id;
   private String name;
    private double marks;


    public int id() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }


    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public double marks() {
        return marks;
    }

    public Student setMarks(double marks) {
        this.marks = marks;
        return this;
    }
}
