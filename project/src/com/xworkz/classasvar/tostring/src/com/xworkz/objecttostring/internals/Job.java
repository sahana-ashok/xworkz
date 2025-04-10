package com.xworkz.prog.tostring.src.com.xworkz.objecttostring.internals;

public class Job {

        private String title;
        private String company;
        private double salary;

        public Job(String title, String company, double salary) {
            this.title = title;
            this.company = company;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Job [Title = " + title + ", Company = " + company + ", Salary = ₹" + salary + "]";
        }
    }

