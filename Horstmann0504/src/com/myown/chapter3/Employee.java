package com.myown.chapter3;

public class Employee implements Measurable {
    private double salary = 0;

    public Employee() {
    }

    public Employee(int salary) {
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
}
