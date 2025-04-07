package com.xworkz.prog.Output;

import com.xworkz.prog.casting.employee.Company;
import com.xworkz.prog.casting.employee.Employee;
import com.xworkz.prog.casting.employee.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.work();
        emp1.salary();
        emp1.benefits();
        emp1.experience();
        emp1.department();

        System.out.println("-------------------");

        Employee emp = new Manager();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();

        System.out.println("-------------------");

        Manager manager = new Manager();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();

        System.out.println("-------casting example------------");

        Company company = new Company();
        company.operate(emp);
        company.operate(emp1);
        company.operate(manager);
    }
}
