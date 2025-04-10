package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Teacher {
    private int id;
    private String name;
    private String subject;

    public Teacher(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher details: ID = " + id + ", Name = " + name + ", Subject = " + subject;
    }
}
