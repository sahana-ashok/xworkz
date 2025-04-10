package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Student {
    private int rollNumber;
    private String name;
    private double marks;

    public Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student details: Roll Number = " + rollNumber + ", Name = " + name + ", Marks = " + marks;
    }
}
