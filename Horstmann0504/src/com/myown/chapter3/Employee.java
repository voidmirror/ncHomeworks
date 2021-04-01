package com.myown.chapter3;

public class Employee implements Measurable {
    private String name;
    private double salary = 0;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double average(Measurable[] objects) {
        double sum = 0;

        for (Measurable m : objects) {
            sum += m.getMeasure();
        }

        return sum;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
