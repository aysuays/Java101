package com.patika.dev.Employee;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYears;

    public Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public double tax(){
        if ( this.salary <= 1000 )
            return 0;
        else
            return this.salary * 3 / 100;
    }


    public int bonus( ){
        if ( this.workHours >=40 )
            return (this.workHours - 40) * 30;
        return 0;
    }

    public void raiseSalary(){
        int yearNow= 2021;
        int different = yearNow - this.hireYears;

        System.out.println("diffenrent:" +different);

        if ( different > 19 )
            this.salary = this.salary * 115 / 100;
        else if ( different > 9 && different < 20 )
            this.salary = this.salary * 110 / 100;
        else if( different < 10 )
        {
            this.salary = this.salary * 105 / 100;
        }

    }

    public void writeAll(){
        System.out.println("Name :" + this.name);
        System.out.println("Salary:" + this.salary);
        System.out.println("Working Hours:"+ this.workHours);
        System.out.println("Hire Year:" + this.hireYears);
        double tax1 = this.tax();
        System.out.println("Tax :" + tax1);
        int bonus1 = this.bonus();
        System.out.println("Bonus :" + bonus1);
        System.out.println("Salary With Tax and Bonus:" + (this.salary - tax1 + bonus1));
        this.raiseSalary();
        System.out.println("Salary With Raise:" + this.salary);
    }
}
