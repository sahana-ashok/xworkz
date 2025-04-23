package com.xworkz.prog;

 class Student {
        String name;
        int age;

        // Constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println(name + " is " + age + " years old.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Student s1 = new Student("Asha", 20);  // constructor called
            s1.display();
        }
    }

